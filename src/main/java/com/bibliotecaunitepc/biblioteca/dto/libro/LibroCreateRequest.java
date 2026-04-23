package com.bibliotecaunitepc.biblioteca.dto.libro;

import com.bibliotecaunitepc.biblioteca.enums.TipoLibro;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class LibroCreateRequest {
    private String tituloOriginal;
    private String descripcionGeneral;
    private TipoLibro tipoLibro;
}
