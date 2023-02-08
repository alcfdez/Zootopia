package com.zootopia.zootopia.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zootopia.zootopia.models.Gender;
import com.zootopia.zootopia.repositories.GenderRepository;

@Service
public class GenderService {
    private GenderRepository service;

    public GenderService(GenderRepository service) {
        this.service = service;
    }

    public List<Gender> getAll(){
        return service.findAll();
    }

    
}
