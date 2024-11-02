package com.queimadas.focos.repository;

import com.queimadas.focos.models.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
    Estado findBySg_uf(String sg_uf);
}