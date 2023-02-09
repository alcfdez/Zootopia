package com.zootopia.zootopia.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zootopia.zootopia.models.Specimen;
import com.zootopia.zootopia.services.SpecimenService;
import com.zootopia.zootopia.services.GenderService;
import com.zootopia.zootopia.services.ClasificationService;
import com.zootopia.zootopia.payLoads.SpecimenPayLoads;



@RestController
@RequestMapping(path = "/api/specimens")
public class SpecimenController {
    private SpecimenService service;
    private GenderService genderService;
    private ClasificationService clasificationService;
    

    public SpecimenController(SpecimenService service) {
        this.service = service;
    }
    @GetMapping(path = "")
    public List<Specimen> getAll() {
        return service.getAll();
    }
    @GetMapping(path = "/{id}")
    public Specimen getOne(@PathVariable Long id){
        return service.getOne(id);
    }
    @PutMapping(path = "/{id}")
    public ResponseEntity<Object> update(@PathVariable Long id, @RequestBody SpecimenPayLoads specimen){
        Specimen specimenTemporal = service.getOne(id);
        try {
            if(specimenTemporal != null){
                specimen.setId(id);
                service.save(specimen);
                return new ResponseEntity<>(HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping(path = "")
    public void save(@RequestBody SpecimenPayLoads specimen){

        service.save(specimen); 
    }
    @DeleteMapping(path = "/{id}")
    public List<Specimen> delete(@PathVariable Long id){
        return service.delete(id);
    }
    
}
