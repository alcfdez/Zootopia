package com.zootopia.zootopia.models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "borns")
public class Born {
    
    @OneToOne
    private Country idCountry;
    @OneToOne
    private Specimen idspecimen;
    
}
