package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

@Service
public class ValidateService {
    public Boolean validate(User user) {
        return true;
    }
}
