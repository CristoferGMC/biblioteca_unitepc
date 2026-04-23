package com.bibliotecaunitepc.biblioteca.dto.prestamo;

import com.bibliotecaunitepc.biblioteca.enums.EstadoPrestamo;
import com.bibliotecaunitepc.biblioteca.enums.TipoPrestamo;
import com.bibliotecaunitepc.biblioteca.model.DetallePrestamo;
import com.bibliotecaunitepc.biblioteca.model.Estudiante;
import com.bibliotecaunitepc.biblioteca.model.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class PrestamoCreateRequest {
    private LocalDateTime fechaPrestamo;
    private EstadoPrestamo estadoPrestamo;
    private TipoPrestamo tipoPrestamo;
    private Long usuarioId;
    private Long estudianteId;
    private List<Long> ejemplarIds;
}
