package com.queimadas.focos.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cadastro_oficial_civil")
@Data
public class ServicoEmergencia {
    private @Id int id_oficial_civil;
    private String nm_oficial_civil;
    private String nr_telefone;
    private String cd_municipio;
}
