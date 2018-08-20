package com.yl.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableZuulProxy
public class MicroserviceGatewayZuulFallbackApplication {
    @Bean
    public UserFallbackProvider userFallbackProvider() {
        return new UserFallbackProvider();
    }

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceGatewayZuulFallbackApplication.class, args);
    }
}
