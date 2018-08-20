package com.yl.microservice.controller;

import com.yl.microservice.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author Liang.Yang5
 */
@RestController
public class UserController {
    @GetMapping("/test")
    public String test() {
        return "hello,test";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public User getUser(@PathVariable Long id) {
        User user = new User();
        if (id == 99L) {
            user.setId(99L);
            user.setUserName("user");
            user.setName("Tom");
            user.setAge(24);
            user.setBalance(new BigDecimal("99"));
            return user;
        }
        user.setId(-1L);
        user.setUserName("ERROR");
        return user;
    }
}