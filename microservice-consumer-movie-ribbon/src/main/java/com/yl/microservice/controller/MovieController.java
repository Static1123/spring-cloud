package com.yl.microservice.controller;

import com.yl.microservice.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;


@RestController
public class MovieController {
    private static final Logger LOGGER = LoggerFactory.getLogger(MovieController.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/user-test")
    public String test() {
        return this.restTemplate.getForObject("http://microservice-provider-user/test", String.class);
    }

    @GetMapping("/log-user-instance")
    public void logUserInstance() {
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("microservice-provider-user");
        LOGGER.info("{}:{}:{}", serviceInstance.getServiceId(), serviceInstance.getHost(), serviceInstance.getPort());
    }

    @GetMapping("/user/{id}")
    @ResponseBody
    public User getUser(@PathVariable Long id) {
        User user = new User();
        if (id == 99) {
            user.setId(99L);
            user.setUserName("movieUser");
            user.setName("movie");
            user.setAge(22);
            user.setBalance(new BigDecimal("1000"));
            return user;
        }
        user.setId(-1L);
        user.setUserName("ERROR");
        return user;
    }
}