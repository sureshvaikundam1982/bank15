package com.bank.api_gateway.config;


import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRoutes(RouteLocatorBuilder builder) {

        return builder.routes()

                // Route for Account Service
                .route("account-service", r -> r
                        .path("/account/**")
                        .uri("lb://ACCOUNT-SERVICE"))

                // Route for Transaction Service
                .route("transaction-service", r -> r
                        .path("/transaction/**")
                        .uri("lb://TRANSACTION-SERVICE"))

                .build();
    }
}
