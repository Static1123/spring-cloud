package com.yl.microservice.controller;

import com.yl.microservice.dao.UserRepository;
import com.yl.microservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        User user = userRepository.findOne(id);
        if (user == null) {
            user = new User();
        }
        return user;
    }
}