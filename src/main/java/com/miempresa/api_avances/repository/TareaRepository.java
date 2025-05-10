package com.miempresa.api_avances.repository;

import com.miempresa.api_avances.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepository extends JpaRepository<Tarea, Long> {
}

