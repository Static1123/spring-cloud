package com.yl.microservice.controller;

import com.yl.microservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    @Autowired
    private UserService userService;

    @GetMapping("/user-test")
    public String test() {
        return userService.userTest();
    }
}