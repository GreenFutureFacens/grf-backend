package com.queimadas.focos.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public List<FocoQueimada> getByPeriodCity(
        @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate start,
        @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate end,
        @RequestParam String code) {

        return this.focoQueimadaService.findByPeriodAndCity(start, end, code);
    }
}