package com.yl.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class MicroserviceProviderUserAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProviderUserAuthApplication.class, args);
    }
}