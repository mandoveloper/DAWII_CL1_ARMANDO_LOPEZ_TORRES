package com.cibertec.edu.DAWII_CL1_ARMANDO_LOPEZ_TORRES.model.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ResultadoResponse {
    private Boolean respuesta;
    private String mensaje;
}

