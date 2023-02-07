package com.zootopia.zootopia.services;

import org.springframework.stereotype.Service;

import com.zootopia.zootopia.repositories.UserRepository;

@Service
public class UserService {
    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    
}
