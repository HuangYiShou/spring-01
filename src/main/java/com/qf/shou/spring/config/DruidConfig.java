package com.qf.shou.spring.config;

import com.qf.shou.spring.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DruidConfig {
    @Bean
    public User getUser(){
        User user = new User();
        user.setUserId(1);
        user.setUsername("老王");
        user.setPassword("123456");
        return user;

    }

}
