package com.yl.microservice.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
    @Bean
    public Contract customContract() {
        return new Contract.Default();
    }
}