package com.qf.shou.spring.controller;

import com.qf.shou.spring.service.UserService;

import com.qf.shou.spring.service.UserServiceImpl;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
/**
 * 使用
 * Spring （控制反转 依赖注入）
 * 控制反转：java代码把创建对象的控制权利交给spring来创建和管理依赖
 * 依赖注入：java代码要使用对象时只需向spring声明被spring托管的对象则能获得到对象
 *
 *  @Configuration ssm 项目  xml + 注解方式
 *  springboot  java config+ 注解方式
 *
 * @Component 是@Controller @Service @Repository 的父注解 应用场景为不是这controller service dao三层的类
 * @Configuration 修饰类 和@Bean 修饰方法 配套使用 一般是用来配读取配置文件或java自己new对象
 * @Resource @Autowired 一般用来修饰属性 属性必须public来修饰
 */

import javax.annotation.Resource;

@Controller
public class UserController {

    //@Autowired spring框架自带的注解
    @Resource //
     public UserService userService;
    public void sayHi(){
        userService.say();
    }



}
