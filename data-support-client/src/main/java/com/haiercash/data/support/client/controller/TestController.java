package com.haiercash.data.support.client.controller;

import com.haiercash.data.support.client.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    UserService userService;

    @RequestMapping("/get")
    public void get(){
        System.out.println(userService.selectUserByName("test").getMobile());
        System.out.println(userService.selectComputerByName("test").getType());
    }
}
