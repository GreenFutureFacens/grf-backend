package com.queimadas.focos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.queimadas.focos.models.Estado;
import com.queimadas.focos.services.EstadoService;

@RestController
@RequestMapping("/api/estado")
public class EstadoController {
    @Autowired
    private EstadoService estadoService;
    
    @GetMapping
    public List<Estado> getAll() {
        return this.estadoService.findAll();
    }

    @GetMapping("/{sigla}")
    public Estado getByCodigo(@PathVariable String sigla) {
        return this.estadoService.findBySigla(sigla);
    }
}