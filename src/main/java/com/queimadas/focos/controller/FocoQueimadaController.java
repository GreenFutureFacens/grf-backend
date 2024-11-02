package com.queimadas.focos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.queimadas.focos.DTO.FocoQueimadaDTO;
import com.queimadas.focos.models.FocoQueimada;
import com.queimadas.focos.services.FocoQueimadaService;

@RestController
@RequestMapping("/api/focos")
public class FocoQueimadaController {
    @Autowired
    private FocoQueimadaService focoQueimadaService;
    
    @GetMapping
    public List<FocoQueimada> getAll() {
        return this.focoQueimadaService.findAll();
    }

    @GetMapping("/period")
    public List<FocoQueimada> getByPeriod(@RequestBody FocoQueimadaDTO focoQueimadaDTO) {
        return this.focoQueimadaService.findByPeriod(focoQueimadaDTO.getStart(),focoQueimadaDTO.getEnd());
    }

    @GetMapping("/period/city")
    public List<FocoQueimada> getByPeriodCity(@RequestBody FocoQueimadaDTO focoQueimadaDTO) {
        return this.focoQueimadaService.findByPeriodAndCity(focoQueimadaDTO.getStart(),focoQueimadaDTO.getEnd(),focoQueimadaDTO.getCode());
    }
}