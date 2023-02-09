package com.zootopia.zootopia.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import javax.persistence.Table;

@Entity
@Table(name = "specimens")
public class Specimen {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_specimen")
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private LocalDate entryDate; 
    @ManyToOne
    private Clasification clasification;
    @ManyToOne
    private Gender gender;
    public Specimen() {
    }
    public Specimen(Long id, String name, LocalDate entryDate, Clasification clasification, Gender gender) {
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
    public Clasification getClasification() {
        return clasification;
    }
    public void setClasification(Clasification clasification) {
        this.clasification = clasification;
    }
    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    
    

}
