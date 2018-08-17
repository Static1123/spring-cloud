package com.yl.microservic.service;

import com.yl.microservic.model.User;

/**
 * @author Liang.Yang5
 */
//@FeignClient(name = "microservice-provider-user")
public interface UserService {
    /**
     * this is a test
     *
     * @return
     */
//    @GetMapping("/test")
    String test();
    
    User findByOne(long id);
}