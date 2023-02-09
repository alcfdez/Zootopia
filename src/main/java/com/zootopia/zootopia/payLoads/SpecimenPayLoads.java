package com.zootopia.zootopia.payLoads;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class SpecimenPayLoads {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate entryDate;
    private Long clasification;
    private Long gender;
    public SpecimenPayLoads() {
    }
    public SpecimenPayLoads(Long id,String name, LocalDate entryDate, Long clasification, Long gender) {
        this.id = id;
        this.name = name;
        this.entryDate = entryDate;
        this.clasification = clasification;
        this.gender = gender;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getEntryDate() {
        return entryDate;
    }
    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }
    public Long getClasification() {
        return clasification;
    }
    public void setClasification(Long clasification) {
        this.clasification = clasification;
    }
    public Long getGender() {
        return gender;
    }
    public void setGender(Long gender) {
        this.gender = gender;
    }
    

    
}
