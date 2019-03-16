package com.alex.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * UserMapper: Alex
 * Date: 2019/3/16
 * Time: 21:39
 **/

@RestController
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("hello")
    public String Hello() {
        return "hello mvn spring boot";
    }

}
