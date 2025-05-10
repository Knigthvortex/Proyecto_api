package com.miempresa.api_avances.repository;

import com.miempresa.api_avances.model.Avance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvanceRepository extends JpaRepository<Avance, Long> {
}
