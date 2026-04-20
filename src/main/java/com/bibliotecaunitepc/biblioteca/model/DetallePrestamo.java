package com.bibliotecaunitepc.biblioteca.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class DetallePrestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime fechaDevolucion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ejemplar_id")
    private Ejemplar ejemplar;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prestamo_id")
    private Prestamo prestamo;
}
