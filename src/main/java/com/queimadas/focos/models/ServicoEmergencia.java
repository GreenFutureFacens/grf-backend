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
    private @Id Integer idOficialCivil;
    private @Column String nmOficialCivil;
    private @Column String nrTelefone;
    private @Column String cdMunicipio;
}
