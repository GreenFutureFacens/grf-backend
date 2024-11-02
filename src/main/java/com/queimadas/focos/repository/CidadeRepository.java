package com.queimadas.focos.repository;

import com.queimadas.focos.models.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository 
public interface CidadeRepository extends JpaRepository<Cidade, String> {
    Cidade findByCd_municipio(String cd_municipio);
}