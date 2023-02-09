package com.zootopia.zootopia.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zootopia.zootopia.models.Clasification;
import com.zootopia.zootopia.services.ClasificationService;

@RestController
@RequestMapping(path = "/api/clasifications")
public class ClasificationController {
    private ClasificationService service;

    public ClasificationController(ClasificationService service) {
        this.service = service;
    }


    @GetMapping(path = "")
    public List<Clasification> getAll(){
        return service.getAll();
    }

    /* @GetMapping(path = "/{id}")
    public List<Clasification> getForFamily(@PathVariable Long id){
        return service.getTypes(id);
    } */
    
}
