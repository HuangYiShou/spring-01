package com.qf.shou.spring;

import com.qf.shou.spring.controller.UserController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        String path = "classpath:spring-context.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);
        UserController userController = applicationContext.getBean("userController", UserController.class);
        userController.sayHi();
    }
}
