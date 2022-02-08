package com.steinrayrevive.tutorial.restcontroller.controller;

import com.steinrayrevive.tutorial.restcontroller.model.UserDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1")
public class UserController {

    @RequestMapping(path = "/findUser",method = RequestMethod.GET)
    public UserDto findUser(){
        return UserDto.builder().name("MyName").age(18).build();
    }
}
