package com.uptc.frw.vuelos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication   // ahora escanea todo com.uptc.frw.vuelos.*
@EnableScheduling
public class VuelosApplication {
    public static void main(String[] args) {
        SpringApplication.run(VuelosApplication.class, args);
    }
}