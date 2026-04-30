package com.bibliotecaunitepc.biblioteca.model;

import com.bibliotecaunitepc.biblioteca.enums.TipoLibro;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 255)
    private String tituloOriginal;
    @Column(columnDefinition = "TEXT")
    private String descripcionGeneral;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoLibro tipoLibro;
    @OneToMany(mappedBy = "libro")
    private List<Edicion> ediciones = new ArrayList<>();
}
