package com.example.Feign;

import com.example.Feign.model.User;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "validator", url = "localhost:8090")
public interface FeignValidateUsers {

    @GetMapping(value = "/test")
    String test();

    @PostMapping(value = "/validate")
    Boolean validate(@RequestParam User user);
}
