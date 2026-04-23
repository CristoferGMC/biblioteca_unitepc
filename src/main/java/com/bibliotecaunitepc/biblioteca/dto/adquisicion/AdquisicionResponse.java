package com.bibliotecaunitepc.biblioteca.dto.adquisicion;

import com.bibliotecaunitepc.biblioteca.enums.TipoAdquisicion;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class AdquisicionResponse {
    private Long id;
    private String proveedor;
    private LocalDate fecha_adquisicion;
    private TipoAdquisicion tipoAdquisicion;
}
