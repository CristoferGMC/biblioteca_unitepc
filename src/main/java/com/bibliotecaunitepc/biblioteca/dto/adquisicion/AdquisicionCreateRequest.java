package com.bibliotecaunitepc.biblioteca.dto.adquisicion;

import com.bibliotecaunitepc.biblioteca.enums.TipoAdquisicion;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class AdquisicionCreateRequest {
    private String proveedor;
    private LocalDate fecha_adquisicion;
    private BigDecimal precio;
    private TipoAdquisicion tipoAdquisicion;
}
