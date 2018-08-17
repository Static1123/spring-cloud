package com.yl.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author Liang.Yang5
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class MicroserviceConsumerMovieFeignHystrixFallbackApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConsumerMovieFeignHystrixFallbackApplication.class, args);
    }
}