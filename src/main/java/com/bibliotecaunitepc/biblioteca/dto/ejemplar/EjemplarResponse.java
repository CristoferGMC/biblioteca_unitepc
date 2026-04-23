package com.bibliotecaunitepc.biblioteca.dto.ejemplar;

import com.bibliotecaunitepc.biblioteca.enums.EstadoEjemplar;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class EjemplarResponse {
    private Long id;
    private String CodigoEjemplar;
    private String comentario;
    private EstadoEjemplar estadoEjemplar;
    private LocalDate fechaIngreso;
}
