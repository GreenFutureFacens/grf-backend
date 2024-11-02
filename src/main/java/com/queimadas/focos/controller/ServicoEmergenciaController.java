package com.queimadas.focos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.queimadas.focos.services.ServicoEmergenciaService;
import com.queimadas.focos.models.ServicoEmergencia;

@RestController
@RequestMapping("/api/servico-emergencia")
public class ServicoEmergenciaController {
    @Autowired
    private ServicoEmergenciaService servicoEmergenciaService;
    
    @GetMapping
    public List<ServicoEmergencia> getAll() {
        return this.servicoEmergenciaService.findAll();
    }

    @GetMapping("/{codigo}")
    public List<ServicoEmergencia> getByCodigo(@PathVariable String sigla) {
        return this.servicoEmergenciaService.findByMunicipio(sigla);
    }
}