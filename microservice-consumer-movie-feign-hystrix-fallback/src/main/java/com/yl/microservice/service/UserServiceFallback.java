package com.yl.microservice.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Liang.Yang5
 * @date 2018/8/17 14:16
 */
@Service
public class UserServiceFallback implements UserService {
    @GetMapping("/test")
    @Override
    public String test() {
        return "This is user service fallback!!!";
    }
}