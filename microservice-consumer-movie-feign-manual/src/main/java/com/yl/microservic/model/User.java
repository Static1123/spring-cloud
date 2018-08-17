package com.yl.microservic.model;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Liang.Yang5
 * @date 2018/8/17 10:20
 */
@Data
public class User {
    private long id;

    private String username;

    private String name;

    private Integer age;

    private BigDecimal balance;
}
