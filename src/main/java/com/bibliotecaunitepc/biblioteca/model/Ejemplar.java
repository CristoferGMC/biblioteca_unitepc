package com.bibliotecaunitepc.biblioteca.model;

import com.bibliotecaunitepc.biblioteca.enums.EstadoEjemplar;
import com.bibliotecaunitepc.biblioteca.enums.TipoEjemplar;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ejemplar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigoInventario;

    @Column(columnDefinition = "TEXT")
    private String comentario;

    @Enumerated(EnumType.STRING)
    private EstadoEjemplar estadoEjemplar;

    @Enumerated(EnumType.STRING)
    private TipoEjemplar tipoEjemplar;
    private LocalDate fecha_ingreso;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "edicion_id")
    private Edicion edicion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "adquisicion_id")
    private Adquisicion adquisicion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "campus_id")
    private Campus campus;
}
