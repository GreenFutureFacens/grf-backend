package com.queimadas.focos.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cadastro_municipio")
@Data
public class Cidade {
    private @Id String cdMunicipio;
    private @Column String nmMunicipio;
    private @Column Integer cdUf;
}
