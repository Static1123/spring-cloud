package com.yl.microservice.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

/**
 * @author Liang.Yang5
 * @date 2018/8/15 19:57
 */
@Service
public class UserService {
    public User findOne() {
        return new User("", "", null);
    }
}