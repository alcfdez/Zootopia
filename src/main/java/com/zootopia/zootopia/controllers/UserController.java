package com.zootopia.zootopia.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zootopia.zootopia.services.UserService;

@RestController 
@RequestMapping(path="/api/users")
public class UserController {
    
    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    
}
