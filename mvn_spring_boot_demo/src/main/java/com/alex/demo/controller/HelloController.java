package com.alex.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserMapper: Alex
 * Date: 2019/3/16
 * Time: 21:39
 **/

@RestController
public class HelloController {

    @GetMapping("hello")
    public String Hello() {
        return "hello mvn spring boot";
    }

}
