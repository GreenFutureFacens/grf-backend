package com.queimadas.focos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.queimadas.focos.models.Estado;
import com.queimadas.focos.repository.EstadoRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EstadoService {
    @Autowired
    private EstadoRepository estadoRepository;

    public List<Estado> findAll() {
        return this.estadoRepository.findAll();
    }

    public Estado findBySigla(String sigla) {
        return this.estadoRepository.findBySg_uf(sigla);
    }
}
