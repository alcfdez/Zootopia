package com.zootopia.zootopia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zootopia.zootopia.models.Clasification;

public interface ClasificationRepository extends JpaRepository<Clasification, Long> {
    
}
