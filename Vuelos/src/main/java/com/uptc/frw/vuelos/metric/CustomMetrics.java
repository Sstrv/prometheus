package com.uptc.frw.vuelos.metric;

import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MeterRegistry;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@EnableScheduling
@Component
public class CustomMetrics {

    @Autowired
    private MeterRegistry meterRegistry;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // mapa que contendrá los conteos actualizados
    private final Map<String, Double> vuelosPorRuta = new ConcurrentHashMap<>();

    @PostConstruct
    public void init() {
        // gauges que siempre leen directamente de la BD
        meterRegistry.gauge("oracle_personas_total", this, CustomMetrics::countPersonas);
        meterRegistry.gauge("oracle_aviones_total", this, CustomMetrics::countAviones);
        meterRegistry.gauge("oracle_vuelos_total", this, CustomMetrics::countVuelos);

        // registra una métrica dinámica por cada par origen/destino
        updateVuelosPorOrigenDestino();
    }

    private int countPersonas() {
        return jdbcTemplate.queryForObject("SELECT COUNT(*) FROM personas", Integer.class);
    }

    private double countAviones() {
        return jdbcTemplate.queryForObject("SELECT COUNT(*) FROM avion", Double.class);
    }

    private double countVuelos() {
        return jdbcTemplate.queryForObject("SELECT COUNT(*) FROM vuelos", Double.class);
    }

    @Scheduled(fixedRate = 5000)
    void updateVuelosPorOrigenDestino() {
        List<Map<String, Object>> rows = jdbcTemplate.queryForList(
                "SELECT origen, destino, COUNT(*) AS c FROM vuelos GROUP BY origen, destino"
        );

        for (Map<String, Object> row : rows) {
            String origen = (String) row.get("ORIGEN");
            String destino = (String) row.get("DESTINO");
            Double count = ((Number) row.get("C")).doubleValue();

            String key = origen + "_" + destino;
            vuelosPorRuta.put(key, count);

            // si el gauge aún no existe, créalo una sola vez
            if (meterRegistry.find("oracle_vuelos_por_origen_destino")
                    .tags("origen", origen, "destino", destino)
                    .gauge() == null) {

                Gauge.builder("oracle_vuelos_por_origen_destino", vuelosPorRuta,
                                map -> map.getOrDefault(key, 0.0))
                        .description("Cantidad de vuelos agrupados por origen y destino")
                        .tag("origen", origen)
                        .tag("destino", destino)
                        .register(meterRegistry);
            }
        }
    }
}

