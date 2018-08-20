package com.yl.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

/**
 * @author Liang.Yang5
 * @date 2018/8/20 14:42
 */
@SpringBootApplication
@EnableSidecar
public class MicroserviceSidecarApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSidecarApplication.class, args);
    }
}