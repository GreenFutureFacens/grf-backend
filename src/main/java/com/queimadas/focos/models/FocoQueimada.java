package com.queimadas.focos.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "foco_queimada_municipio")
@Data
public class FocoQueimada {
    private @Id Integer cdFoco;
    private @Column LocalDate dtFoco;
    private @Column Float nrLongitude;
    private @Column Float nrLatitude;
    private @Column String cdMunicipio;
    
}
