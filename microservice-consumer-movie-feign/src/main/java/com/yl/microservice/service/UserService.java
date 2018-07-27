package com.yl.microservice.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "microservice-provider-user")
public interface UserService {
    @GetMapping("/test")
    String test();
}