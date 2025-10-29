package com.seuprojeto.petshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**") // Aplica para todos os endpoints da API
                        .allowedOrigins("http://localhost:8080") // O front-end servido pelo próprio Spring Boot
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS"); // Métodos permitidos
            }
        };
    }
}