package com.zootopia.zootopia.services;

import java.util.List;

import com.zootopia.zootopia.models.Specimen;

import org.springframework.stereotype.Service;
import com.zootopia.zootopia.repositories.SpecimenRepository;

@Service
public class SpecimenService {
    private SpecimenRepository repository;

    public List<Specimen> getAll(){
        return repository.findAll();
    }

    public Specimen getOne(Long id){

        return repository.findById(id).get();
    }
    public void save(Specimen specimen){
        repository.save(specimen);
    }
    public List<Specimen> delete(Long id){
        repository.deleteById(id);
        return repository.findAll();
    }
    
}
