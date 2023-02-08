package com.zootopia.zootopia.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zootopia.zootopia.models.Country;
import com.zootopia.zootopia.repositories.CountryRepository;

@Service
public class CountryService {
    private CountryRepository repository;

    public CountryService(CountryRepository repository) {
        this.repository = repository;
    }

    public List<Country> getAll(){
        return repository.findAll();
    }
    public void save(Country country){
        repository.save(country);
    }
}
