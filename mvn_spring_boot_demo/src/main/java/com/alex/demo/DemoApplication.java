package com.alex.demo;

//import  org.mybatis.spring.annotation.MapperScan;
// 使用通用mapper后将mybatis mapper改成tk的mapper
import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * UserMapper: Alex
 * Date: 2019/3/16
 * Time: 21:33
 **/
@SpringBootApplication
@MapperScan("com.alex.demo.mapper")
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
