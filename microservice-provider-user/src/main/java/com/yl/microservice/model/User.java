package com.yl.microservice.model;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Liang.Yang5
 * @date 2018/8/20 16:13
 */
@Data
public class User {
    private Long id;
    private String userName;
    private String name;
    private Integer age;
    private BigDecimal balance;
}
