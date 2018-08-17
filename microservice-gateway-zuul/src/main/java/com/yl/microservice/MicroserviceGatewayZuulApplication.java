package com.yl.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Liang.Yang5
 */
@SpringBootApplication
@EnableZuulProxy
public class MicroserviceGatewayZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceGatewayZuulApplication.class, args);
    }
}