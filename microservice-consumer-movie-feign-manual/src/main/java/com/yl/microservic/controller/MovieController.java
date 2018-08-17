package com.yl.microservic.controller;

import com.yl.microservic.model.User;
import com.yl.microservic.service.UserService;
import feign.Client;
import feign.Contract;
import feign.Feign;
import feign.auth.BasicAuthRequestInterceptor;
import feign.codec.Decoder;
import feign.codec.Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClientsConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Liang.Yang5
 */
@RestController
@Import(FeignClientsConfiguration.class)
public class MovieController {
    private UserService userService;
    private UserService adminService;

    @Bean
    public Contract feignContract() {
        return new Contract.Default();
    }

    @Autowired
    public MovieController(Decoder decoder, Encoder encoder, Client client) {
        System.out.println(decoder);
        System.out.println(encoder);
        System.out.println(feignContract());
        this.userService = Feign.builder().client(client).encoder(encoder).decoder(decoder).contract(feignContract())
                .requestInterceptor(new BasicAuthRequestInterceptor("user", "password1"))
                .target(UserService.class, "http://microservice-provider-user");
        this.adminService = Feign.builder().client(client).encoder(encoder).decoder(decoder).contract(feignContract())
                .requestInterceptor(new BasicAuthRequestInterceptor("admin", "password2"))
                .target(UserService.class, "http://microservice-provider-user");
    }

    @GetMapping("/user-user/{id}")
    public User findByUser(@PathVariable long id) {
        return userService.findByOne(id);
    }

    @GetMapping("/user-admin/{id}")
    public User findByAdmin(@PathVariable long id) {
        return adminService.findByOne(id);
    }

    @GetMapping("/user-test")
    public String userTest() {
        return userService.test();
    }
}