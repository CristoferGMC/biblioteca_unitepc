package com.bibliotecaunitepc.biblioteca.model;

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
public class Editorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 255)
    private String nombre;
    @Column(nullable = false, length = 255)
    private String pais;
    @Column(nullable = false, length = 255)
    private String ciudad;
    @OneToMany(mappedBy = "editorial")
    private List<Edicion> ediciones = new ArrayList<>();
}
