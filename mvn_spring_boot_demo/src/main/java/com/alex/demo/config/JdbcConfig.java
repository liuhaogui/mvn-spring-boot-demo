package com.alex.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * UserMapper: Alex
 * Date: 2019/3/16
 * Time: 21:56
 **/
//引入配置文件方式一：
//@Configuration
    //spring 默认读取 application.yaml 配置文件，这里默认java可以自定义文件读取配置
//@PropertySource("classpath:application.yaml")
//public class JdbcConfig {
//
////    java注解方式引入配置
//    @Value("${jdbc.url}")
//    String url;
//    @Value("${jdbc.driverClassName}")
//    String driverClassName;
//    @Value("${jdbc.username}")
//    String username;
//    @Value("${jdbc.password}")
//    String password;
//
//
//    @Bean
//    public DataSource dataSource() {
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setUrl(url);
//        dataSource.setDriverClassName(driverClassName);
//        dataSource.setUsername(username);
//        dataSource.setPassword(password);
//        return dataSource;
//    }
//}

////引入配置文件方式二：
//@Configuration
//@EnableConfigurationProperties(jdbcProperties.class)
//public class JdbcConfig {
//
//    @Bean
//    public DataSource dataSource(jdbcProperties prop) {
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setUrl(prop.getUrl());
//        dataSource.setDriverClassName(prop.getDriverClassName());
//        dataSource.setUsername(prop.getUsername());
//        dataSource.setPassword(prop.getPassword());
//        return dataSource;
//    }
//}

//引入配置文件方式三：
@Configuration
public class JdbcConfig {

    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource() {
        return new DruidDataSource();
    }
}