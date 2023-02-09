package com.zootopia.zootopia.payLoads;

import java.time.LocalDate;

public class SpecimenPayLoads {
    private String name;
    private LocalDate entryDate;
    private Long clasification;
    private Long gender;
    public SpecimenPayLoads() {
    }
    public SpecimenPayLoads(String name, LocalDate entryDate, Long clasification, Long gender) {
        this.name = name;
        this.entryDate = entryDate;
        this.clasification = clasification;
        this.gender = gender;
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
