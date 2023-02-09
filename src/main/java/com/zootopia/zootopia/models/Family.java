package com.zootopia.zootopia.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "families")
public class Family {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name="id_family")
    private Long id;
    @Column(nullable = false)
    private String family;
    
    public Family() {
    }
    
    public Family(Long id, String family) {
        this.id = id;
        this.family = family;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFamily() {
        return family;
    }
    public void setFamily(String family) {
        this.family = family;
    }

    
}
