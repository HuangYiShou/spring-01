package com.qf.shou.spring.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public void say() {
        System.out.println("hello spring");
    }
}
