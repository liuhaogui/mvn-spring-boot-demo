package com.alex.demo.config;

import com.alex.demo.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * User: Alex
 * Date: 2019/3/16
 * Time: 23:34
 **/
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册自己的拦截器
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
    }
}
