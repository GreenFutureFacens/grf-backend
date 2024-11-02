package com.queimadas.focos.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.queimadas.focos.models.FocoQueimada;
import com.queimadas.focos.repository.FocoQueimadaRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class FocoQueimadaService {
    @Autowired
    private FocoQueimadaRepository focoQueimadaRepository;

    public List<FocoQueimada> findAll() {
        return this.focoQueimadaRepository.findAll();
    }

    public List<FocoQueimada> findByPeriod(LocalDate start, LocalDate end) {
        return this.focoQueimadaRepository.findByDt_focoBetween(start, end);
    }

    public List<FocoQueimada> findByPeriodAndCity(LocalDate start, LocalDate end, String codigo) {
        return this.focoQueimadaRepository.findByDt_focoBetweenAndCd_municipio(start, end, codigo);
    }
}
