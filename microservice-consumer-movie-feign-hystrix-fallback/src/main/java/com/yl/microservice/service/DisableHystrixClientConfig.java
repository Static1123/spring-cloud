package com.yl.microservice.service;

import feign.Feign;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author Liang.Yang5
 * @date 2018/8/17 15:02
 */
@Configuration
public class DisableHystrixClientConfig {
    @Bean
    @Scope("prototype")
    public Feign.Builder builder() {
        //Feign.builder去掉了对Hystrix的支持
        return Feign.builder();
    }
}