package com.queimadas.focos.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cadastro_unidade_federativa")
@Data
public class Estado {
    private @Id Integer cdUf;
    private @Column String nmUf;
    private @Column String sgUf;
}
