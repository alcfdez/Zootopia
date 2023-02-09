package com.zootopia.zootopia.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "types")
public class TypeSpecimen {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_type")
    private Long id;
    @Column(nullable = false, name = "type")
    private String typeAnimal;

    public TypeSpecimen() {
    }
    public TypeSpecimen(Long id, String typeAnimal) {
        this.id = id;
        this.typeAnimal = typeAnimal;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTypeAnimal() {
        return typeAnimal;
    }
    public void setTypeAnimal(String typeAnimal) {
        this.typeAnimal = typeAnimal;
    }
    
    
}
