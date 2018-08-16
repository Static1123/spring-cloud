package com.yl.microservice.controller;

import com.yl.microservice.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Collection;

/**
 * @author Liang.Yang5
 * @date 2018/8/15 19:56
 */
@RestController
public class UserController {
    @RequestMapping("/{id}")
    @ResponseBody
    public User findOne(@PathVariable long id) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            UserDetails userDetails = (UserDetails) principal;
            Collection<? extends GrantedAuthority> authorities = userDetails.getAuthorities();
            for (GrantedAuthority item : authorities) {
                System.out.println(String.format("当前用户是：%s，角色是：%s", userDetails.getUsername(), item.getAuthority()));
            }
        }
        User user = new User();
        user.setId(id);
        user.setAge(30);
        user.setBalance(new BigDecimal("99"));
        user.setName("Amy");
        user.setUsername("Amy");
        return user;
    }
}