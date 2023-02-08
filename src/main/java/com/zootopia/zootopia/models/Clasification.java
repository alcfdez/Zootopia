package com.zootopia.zootopia.models;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "clasifications")
public class Clasification {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_clasification")
    private Long id;
    @OneToOne
    private Family family;
    @OneToOne
    private TypeSpecimen type;
    
    public Clasification() {
    }

    public Clasification(Long id, Family family, TypeSpecimen type) {
        this.id = id;
        this.family = family;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public TypeSpecimen getType() {
        return type;
    }

    public void setType(TypeSpecimen type) {
        this.type = type;
    }

    
    
    
}
