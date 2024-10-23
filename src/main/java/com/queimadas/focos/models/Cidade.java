package com.queimadas.focos.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cadastro_municipio")
@Data
public class Cidade {
    private @Id String cd_municipio;
    private String nm_municipio;
    private int cd_uf;
}
