package com.zootopia.zootopia.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "origins")
public class Origin {
    

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_origins")
    private Long id;
    @OneToOne
    private Country country;
    
    @OneToOne
    private Specimen specimen;
    
}
