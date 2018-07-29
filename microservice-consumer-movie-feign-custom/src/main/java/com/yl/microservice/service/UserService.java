package com.yl.microservice.service;

import com.yl.microservice.config.FeignConfig;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "microservice-provider-user", configuration = FeignConfig.class)
public interface UserService {
    @GetMapping("/test")
    String userTest();
}