package com.queimadas.focos.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cadastro_unidade_federativa")
@Data
public class Estado {
    private @Id int cd_uf;
    private String nm_uf;
    private String sg_uf;
}
