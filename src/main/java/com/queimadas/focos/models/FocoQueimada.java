package com.queimadas.focos.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "foco_queimada_municipio")
@Data
public class FocoQueimada {
    private @Id int cd_foco;
    private Data dt_foco;
    private float nr_longitude;
    private float nr_latitude;
    private String cd_municipio;
    
}
