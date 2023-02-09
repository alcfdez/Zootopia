package com.zootopia.zootopia.services;

import java.util.List;

import org.springframework.stereotype.Service;



import com.zootopia.zootopia.models.Clasification;
import com.zootopia.zootopia.repositories.ClasificationRepository;

@Service
public class ClasificationService {
    private ClasificationRepository repository;

    public ClasificationService(ClasificationRepository repository) {
        this.repository = repository;
    }

    public List<Clasification> getAll(){

        return repository.findAll();
    }
    /* public List<Clasification> getTypes(Long id){
        List<Clasification> listAll = repository.findAll();
        List<Clasification> resultList = new ArrayList();
        for (Clasification clasification : listAll) {
            if(clasification.getFamily().getId()==id) resultList.add(clasification);
        }


        return resultList;
    } */
    public Clasification getOne(Long id){
        return repository.findById(id).orElse(null);
    }
    
}
