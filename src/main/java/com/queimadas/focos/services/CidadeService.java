package com.queimadas.focos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.queimadas.focos.models.Cidade;
import com.queimadas.focos.repository.CidadeRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CidadeService {
    @Autowired
    private CidadeRepository cidadeRepository;

    public List<Cidade> findAll() {
        return this.cidadeRepository.findAll();
    }

    public Cidade findByCodigoCidade(String codigoCidade) {
        return this.cidadeRepository.findByCd_municipio(codigoCidade);
    }

}
