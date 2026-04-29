package com.bibliotecaunitepc.biblioteca.dto.ejemplar;

import com.bibliotecaunitepc.biblioteca.enums.EstadoEjemplar;
import com.bibliotecaunitepc.biblioteca.enums.TipoEjemplar;
import lombok.*;

import java.time.LocalDate;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EjemplarResponse {
    private Long id;
    private String titulo;
    private int edicion;
    private String codigoEjemplar;
    private String comentario;
    private EstadoEjemplar estadoEjemplar;
    private TipoEjemplar tipoEjemplar;
    private LocalDate fechaIngreso;
}
