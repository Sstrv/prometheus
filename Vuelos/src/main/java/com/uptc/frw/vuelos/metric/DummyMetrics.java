package com.uptc.frw.vuelos.metric;

import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MeterRegistry;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
public class DummyMetrics {
    private final AtomicInteger dummy = new AtomicInteger(1);
    private final MeterRegistry registry;

    public DummyMetrics(MeterRegistry registry) {
        this.registry = registry;
    }

    @PostConstruct
    void init() {
        Gauge.builder("demo_dummy_gauge", dummy, AtomicInteger::get)
                .description("Dummy gauge para validar registro de métricas")
                .register(registry);
    }
}
