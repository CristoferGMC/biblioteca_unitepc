package com.bibliotecaunitepc.biblioteca.dto.edicion;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class EdicionCreateRequest {
    private String tituloEdicion;
    private String descripcionEdicion;
    private int edicion;
    private int volumen;
    private int paginas;
    private String idioma;
    private boolean edicionEspecial;
    private LocalDate fechaPublicacion;
    private String isbn;
    private String dewey;
    private String cutter;
    private String imagenUrl;
    private Long libroId;
    //MannyToMany
    private List<Long> autorIds;
    private Long editorialId;
    //OneToManyTablaIntermedia
    private List<EdicionDescriptorRequest> edicionDescriptores;
}
