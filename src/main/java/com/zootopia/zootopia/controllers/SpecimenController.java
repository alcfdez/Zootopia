package com.zootopia.zootopia.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zootopia.zootopia.models.Specimen;
import com.zootopia.zootopia.services.SpecimenService;



@RestController
@RequestMapping(path = "/api/specimens")
public class SpecimenController {
    private SpecimenService service;

    public SpecimenController(SpecimenService service) {
        this.service = service;
    }
    @GetMapping(path = "")
    public List<Specimen> getAll() {
        return service.getAll();
    }
    @GetMapping(path = "/{id}")
    public Specimen getOne(@PathVariable Long id){
        return null;
    }
}
