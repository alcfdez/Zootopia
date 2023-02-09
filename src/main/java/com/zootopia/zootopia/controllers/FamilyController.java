package com.zootopia.zootopia.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zootopia.zootopia.models.Family;
import com.zootopia.zootopia.services.FamilyService;

@RestController
@RequestMapping(path = "/api/families")
public class FamilyController {
    private FamilyService service;

    public FamilyController(FamilyService service) {
        this.service = service;
    }

    @GetMapping(path = "")
    public List<Family> getAll(){
        return service.getAll();
    }
    @PostMapping(path = "")
    public void save(@RequestBody Family family){
        service.save(family);
    }
}
