package com.uptc.frw.vuelos.metric;

import io.micrometer.core.instrument.MeterRegistry;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class CustomMetrics {
    @Autowired
    private MeterRegistry meterRegistry;

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @PostConstruct
    public void init(){
        meterRegistry.gauge("oracle_personas_total", this,CustomMetrics::countPersonas);
        meterRegistry.gauge("oracle_aviones_total", this, CustomMetrics::countAviones);
        meterRegistry.gauge("oracle_vuelos_total", this, CustomMetrics::countVuelos);
    }
    private double countPersonas() {
        return jdbcTemplate.queryForObject("SELECT COUNT(*) FROM personas", Double.class);
    }

    private double countAviones() {
        return jdbcTemplate.queryForObject("SELECT COUNT(*) FROM avion", Double.class);
    }

    private double countVuelos() {
        return jdbcTemplate.queryForObject("SELECT COUNT(*) FROM vuelos", Double.class);
    }
}
