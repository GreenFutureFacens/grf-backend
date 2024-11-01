package com.queimadas.focos.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "foco_queimada_municipio")
@Data
public class FocoQueimada {
    private @Id Integer cd_foco;
    private @Column Data dt_foco;
    private @Column Float nr_longitude;
    private @Column Float nr_latitude;
    private @Column String cd_municipio;
    
}
