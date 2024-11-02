package com.queimadas.focos.repository;

import com.queimadas.focos.models.FocoQueimada;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FocoQueimadaRepository extends JpaRepository<FocoQueimada, Integer> {
    List<FocoQueimada> findByDtFocoBetween(LocalDate start, LocalDate end);
    List<FocoQueimada> findByDtFoco(LocalDate dt_foco);
    List<FocoQueimada> findByDtFocoBetweenAndCdMunicipio(LocalDate start, LocalDate end,String codigo);
}