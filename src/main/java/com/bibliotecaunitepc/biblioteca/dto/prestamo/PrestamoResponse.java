package com.bibliotecaunitepc.biblioteca.dto.prestamo;

import com.bibliotecaunitepc.biblioteca.dto.ejemplar.EjemplarCreateRequest;
import com.bibliotecaunitepc.biblioteca.dto.ejemplar.EjemplarResponse;
import com.bibliotecaunitepc.biblioteca.dto.libro.LibroResponse;
import com.bibliotecaunitepc.biblioteca.enums.EstadoPrestamo;
import com.bibliotecaunitepc.biblioteca.enums.TipoPrestamo;

import java.time.LocalDateTime;
import java.util.List;

public class PrestamoResponse {
    private LocalDateTime fechaPrestamo;
    private EstadoPrestamo estadoPrestamo;
    private TipoPrestamo tipoPrestamo;
    private List<String> ejemplarNombres;
}
