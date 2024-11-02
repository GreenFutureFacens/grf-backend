package com.queimadas.focos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.queimadas.focos.models.Cidade;
import com.queimadas.focos.services.CidadeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/cidade")
public class CidadeController {
    @Autowired
    private CidadeService cidadeService;
    
    @GetMapping
    public List<Cidade> getAll() {
        return this.cidadeService.findAll();
    }

    @GetMapping("/{codigo}")
    public Cidade getByCodigo(@PathVariable String codigo) {
        return this.cidadeService.findByCodigoCidade(codigo);
    }
}
