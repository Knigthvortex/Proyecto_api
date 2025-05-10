package com.miempresa.api_avances.service;

import com.miempresa.api_avances.model.Avance;
import com.miempresa.api_avances.repository.AvanceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AvanceService {

    private final AvanceRepository avanceRepository;

    public AvanceService(AvanceRepository avanceRepository) {
        this.avanceRepository = avanceRepository;
    }

    public List<Avance> findAll() {
        return avanceRepository.findAll();
    }

    public Optional<Avance> findById(Long id) {
        return avanceRepository.findById(id);
    }

    public Avance save(Avance avance) {
        return avanceRepository.save(avance);
    }

    public void deleteById(Long id) {
        avanceRepository.deleteById(id);
    }
}

