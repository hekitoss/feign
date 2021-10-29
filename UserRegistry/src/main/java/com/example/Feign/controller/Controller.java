package com.example.Feign.controller;

import com.example.Feign.FeignValidateUsers;
import com.example.Feign.model.User;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final FeignValidateUsers feignValidateUsers;

    @PostMapping(value = "/register")
    public String register(@RequestParam User user){
        return feignValidateUsers.validate(user)? "successful registration": "unsuccessful registration";
    }

    @GetMapping(value = "/test")
    public String tests(){
        return "UserRegistry is working, " + feignValidateUsers.test();
    }
}
