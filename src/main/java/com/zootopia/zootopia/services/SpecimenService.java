package com.zootopia.zootopia.services;

import java.util.List;

import com.zootopia.zootopia.models.Specimen;

import org.springframework.stereotype.Service;
import com.zootopia.zootopia.repositories.SpecimenRepository;
import com.zootopia.zootopia.repositories.ClasificationRepository;
import com.zootopia.zootopia.repositories.GenderRepository;

@Service
public class SpecimenService {
    private SpecimenRepository repository;
    private ClasificationRepository clasificationRepository;
    private GenderRepository genderRepository;
    

    public SpecimenService(SpecimenRepository repository, ClasificationRepository clasificationRepository,GenderRepository genderRepository) {
        this.repository = repository;
        this.clasificationRepository = clasificationRepository;
        this.genderRepository = genderRepository;
    }

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
