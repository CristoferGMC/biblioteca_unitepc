package com.bibliotecaunitepc.biblioteca.dto.prestamo;


import com.bibliotecaunitepc.biblioteca.enums.EstadoPrestamo;
import com.bibliotecaunitepc.biblioteca.enums.TipoPrestamo;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PrestamoResponse {
    private Long id;
    private LocalDateTime fechaPrestamo;
    private EstadoPrestamo estadoPrestamo;
    private TipoPrestamo tipoPrestamo;
    private String personal;
    private String estudiante;
    private List<String> ejemplarCodigos;
}
