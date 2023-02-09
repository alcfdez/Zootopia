package com.zootopia.zootopia.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zootopia.zootopia.models.Country;
import com.zootopia.zootopia.services.CountryService;

@RestController
@RequestMapping(path = "/api/countries")
public class CountryController {
    private CountryService service;

    public CountryController(CountryService service) {
        this.service = service;
    }

    @GetMapping(path = "")
    public List<Country> getAll(){
        return service.getAll();
    }
    @PostMapping(path = "")
    public void save(@RequestBody Country country){
        service.save(country);
    }
}
