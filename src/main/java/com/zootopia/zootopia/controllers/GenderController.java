package com.zootopia.zootopia.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zootopia.zootopia.models.Gender;
import com.zootopia.zootopia.services.GenderService;

@RestController
@RequestMapping(path = "/api/genders")
public class GenderController {
    private GenderService service;

    public GenderController(GenderService service) {
        this.service = service;
    }

    @GetMapping(path = "")
    public List<Gender> getAll(){
        return service.getAll();
    }

}
