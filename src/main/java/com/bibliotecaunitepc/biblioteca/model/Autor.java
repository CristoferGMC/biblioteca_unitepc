package com.bibliotecaunitepc.biblioteca.model;

import com.bibliotecaunitepc.biblioteca.enums.TipoAutor;
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
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,length = 255)
    private String nombre;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoAutor tipoAutor;
    @ManyToMany(mappedBy = "autores")
    private List<Edicion> ediciones = new ArrayList<>();
}
