package com.queimadas.focos.repository;

import com.queimadas.focos.models.FocoQueimada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FocoQueimadaRepository extends JpaRepository<FocoQueimada, Integer> {}