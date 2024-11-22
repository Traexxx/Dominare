package com.dominare.api.model.visitas;

import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.persistence.Id;

public interface VisitasRepository extends JpaRepository <VisitasModel , Long > {
    
}
