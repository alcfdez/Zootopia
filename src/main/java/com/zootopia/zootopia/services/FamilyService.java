package com.zootopia.zootopia.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zootopia.zootopia.models.Family;
import com.zootopia.zootopia.repositories.FamilyRepository;

@Service
public class FamilyService {
    private FamilyRepository repository;

    public FamilyService(FamilyRepository repository) {
        this.repository = repository;
    }

    public List<Family> getAll(){
        return repository.findAll();
    }

    public void save(Family family){
        repository.save(family);
    }
}
