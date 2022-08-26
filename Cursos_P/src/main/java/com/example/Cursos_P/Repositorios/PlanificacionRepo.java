package com.example.Cursos_P.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Cursos_P.Modelos.Planificacion;

public interface PlanificacionRepo extends JpaRepository<Planificacion,Long> {
    
}
