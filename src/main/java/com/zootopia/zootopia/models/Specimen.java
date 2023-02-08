package com.zootopia.zootopia.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "speciemns")
public class Specimen {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_specimen")
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    public LocalDate entryDate; 
    @OneToOne
    private TypeSpecimen typespecimen;
    @OneToOne
    private Gender gender;
    public Specimen() {
    }
    public Specimen(Long id, String name, LocalDate entryDate) {
        this.id = id;
        this.name = name;
        this.entryDate = entryDate;
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
    
    

}
