package com.queimadas.focos.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cadastro_oficial_civil")
@Data
public class ServicoEmergencia {
    private @Id Integer id_oficial_civil;
    private @Column String nm_oficial_civil;
    private @Column String nr_telefone;
    private @Column String cd_municipio;
}
