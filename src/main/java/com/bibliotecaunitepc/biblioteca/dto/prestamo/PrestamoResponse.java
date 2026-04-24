package com.bibliotecaunitepc.biblioteca.dto.prestamo;


import com.bibliotecaunitepc.biblioteca.enums.EstadoPrestamo;
import com.bibliotecaunitepc.biblioteca.enums.TipoPrestamo;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.List;

@Getter @Setter
public class PrestamoResponse {
    private LocalDateTime fechaPrestamo;
    private EstadoPrestamo estadoPrestamo;
    private TipoPrestamo tipoPrestamo;
    private List<String> ejemplarNombres;
}
