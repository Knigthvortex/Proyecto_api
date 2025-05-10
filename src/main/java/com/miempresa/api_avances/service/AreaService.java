package com.miempresa.api_avances.service;

import com.miempresa.api_avances.model.Area;
import com.miempresa.api_avances.repository.AreaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AreaService {

    private final AreaRepository areaRepository;

    public AreaService(AreaRepository areaRepository) {
        this.areaRepository = areaRepository;
    }

    public List<Area> findAll() {
        return areaRepository.findAll();
    }

    public Optional<Area> findById(Long id) {
        return areaRepository.findById(id);
    }

    public Area save(Area area) {
        return areaRepository.save(area);
    }

    public void deleteById(Long id) {
        areaRepository.deleteById(id);
    }
}


