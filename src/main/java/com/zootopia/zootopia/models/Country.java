package com.zootopia.zootopia.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class Country {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_countries")
    private Long id;
    @Column(nullable = false)
    private String country;
    public Country() {
    }
    public Country(Long id, String country) {
        this.id = id;
        this.country = country;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    
}
