package com.alex.demo.controller;

import com.alex.demo.pojo.User;
import com.alex.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * UserMapper: Alex
 * Date: 2019/3/16
 * Time: 21:39
 **/

@RestController
@Slf4j
public class HelloController {

//    @Autowired
//    private DataSource dataSource;

    @Autowired
    private UserService userService;

    //    @GetMapping("hello.do")
    @GetMapping("hello")
    public String Hello() {
        System.out.println("hello main ");
        log.info("hello main ");
        return "hello mvn spring boot";
    }

    @GetMapping("user/{id}")
    public User GetUser(@PathVariable("id") Long id) {
        return userService.queryById(id);
    }


}
