package com.queimadas.focos.DTO;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class FocoQueimadaDTO {
    private LocalDate start;
    private LocalDate end;
    private String code;
}
