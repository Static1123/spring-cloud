package com.yl.microservice.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Liang.Yang5
 */
@FeignClient(name = "microservice-provider-user", fallback = UserServiceFallback.class)
public interface UserService {
    /**
     * this is a test
     *
     * @return
     */
    @GetMapping("/test")
    String test();
}