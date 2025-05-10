package com.miempresa.api_avances.controller;

import com.miempresa.api_avances.model.Avance;
import com.miempresa.api_avances.service.AvanceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/avances")
public class AvanceController {

    private final AvanceService avanceService;

    public AvanceController(AvanceService avanceService) {
        this.avanceService = avanceService;
    }

    @GetMapping
    public List<Avance> getAllAvances() {
        return avanceService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Avance> getAvanceById(@PathVariable Long id) {
        return avanceService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Avance createAvance(@RequestBody Avance avance) {
        return avanceService.save(avance);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Avance> updateAvance(@PathVariable Long id, @RequestBody Avance avance) {
        return avanceService.findById(id).map(existing -> {
            avance.setId(id);
            return ResponseEntity.ok(avanceService.save(avance));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAvance(@PathVariable Long id) {
        if (avanceService.findById(id).isPresent()) {
            avanceService.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}

