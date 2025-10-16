package com.uptc.frw.vuelos.metric;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Component;

@Component
public class CustomMetrics {

    private final Counter requestCounter;

    public CustomMetrics(MeterRegistry registry) {
        // contador personalizado
        requestCounter = Counter.builder("app_requests_total")
                .description("Total de solicitudes personalizadas")
                .register(registry);
    }

    public void incrementRequests() {
        requestCounter.increment();
    }
}