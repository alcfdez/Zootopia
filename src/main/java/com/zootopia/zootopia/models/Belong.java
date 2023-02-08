package com.zootopia.zootopia.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "belongs")
public class Belong {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_family")
    private Family family;
    @Column(nullable = false)
    private Specimen specimen;

    
}
