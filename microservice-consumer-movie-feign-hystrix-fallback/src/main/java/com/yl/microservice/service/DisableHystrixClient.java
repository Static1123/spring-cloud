package com.yl.microservice.service;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * 禁用某个FeignClient使用hystrix熔断机制
 *
 * @author Liang.Yang5
 * @date 2018/8/17 15:01
 */
@FeignClient(name = "microservice-provider-user", configuration = {DisableHystrixClientConfig.class})
public interface DisableHystrixClient {
}