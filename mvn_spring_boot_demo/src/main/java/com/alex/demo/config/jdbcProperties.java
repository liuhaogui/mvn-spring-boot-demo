package com.alex.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * User: Alex
 * Date: 2019/3/16
 * Time: 22:18
 **/
//配置前缀 自动绑定配置文件前缀值

    //第三种注入方式；1、注释掉 当前类就不生效了
//@ConfigurationProperties(prefix = "jdbc")

//编译时自动生成get set方法
@Data
public class jdbcProperties {

    String url;
    String driverClassName;
    String username;
    String password;
}
