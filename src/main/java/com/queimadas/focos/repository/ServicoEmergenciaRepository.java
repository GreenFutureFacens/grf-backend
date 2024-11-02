package com.queimadas.focos.repository;

import com.queimadas.focos.models.ServicoEmergencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoEmergenciaRepository extends JpaRepository<ServicoEmergencia, Integer> {
    List<ServicoEmergencia> findByCd_municipio(String cd_municipio);
}