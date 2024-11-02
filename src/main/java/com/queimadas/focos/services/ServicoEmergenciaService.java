package com.queimadas.focos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.queimadas.focos.repository.ServicoEmergenciaRepository;
import com.queimadas.focos.models.ServicoEmergencia;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ServicoEmergenciaService {
    @Autowired
    private ServicoEmergenciaRepository servicoEmergenciaRepository;

    public List<ServicoEmergencia> findAll() {
        return this.servicoEmergenciaRepository.findAll();
    }

    public List<ServicoEmergencia> findByMunicipio(String codigo) {
        return this.servicoEmergenciaRepository.findByCd_municipio(codigo);
    }
}
