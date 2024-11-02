package com.queimadas.focos.repository;

import com.queimadas.focos.models.FocoQueimada;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FocoQueimadaRepository extends JpaRepository<FocoQueimada, Integer> {
    List<FocoQueimada> findByDt_focoBetween(LocalDate start, LocalDate end);
    List<FocoQueimada> findByDt_foco(LocalDate dt_foco);
    List<FocoQueimada> findByDt_focoBetweenAndCd_municipio(LocalDate start, LocalDate end,String codigo);
}