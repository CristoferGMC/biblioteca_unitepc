package com.bibliotecaunitepc.biblioteca.model;

import com.bibliotecaunitepc.biblioteca.enums.Estado;
import com.bibliotecaunitepc.biblioteca.enums.EstadoPrestamo;
import com.bibliotecaunitepc.biblioteca.enums.TipoPrestamo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime fechaPrestamo;

    @Enumerated(EnumType.STRING)
    private EstadoPrestamo estado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estudiante_id")
    private Estudiante estudiante;
    @OneToMany(mappedBy = "prestamo")
    private List<DetallePrestamo> detallePrestamos = new ArrayList<>();
}
