package com.example.demo.controler;

import com.example.demo.model.User;
import com.example.demo.service.ValidateService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UploadsFile {

    private final ValidateService validateService;

       @PostMapping(value = "/validate")
    Boolean validate(@RequestParam User user){
        System.out.println("start validation for user: " + user);
        return validateService.validate(user);
    }

    @GetMapping(value = "/test")
    String test(){
        return "UserValidator is working";
    }
}
