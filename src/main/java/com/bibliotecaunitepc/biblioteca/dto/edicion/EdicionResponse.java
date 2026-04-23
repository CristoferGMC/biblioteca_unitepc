package com.bibliotecaunitepc.biblioteca.dto.edicion;

import com.bibliotecaunitepc.biblioteca.model.DescriptorEdicion;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class EdicionResponse {
    private Long id;
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
    private List<Long> autorId;
    private Long editorialId;
    //OneToManyTablaIntermedia
    private List<DescriptorEdicion> descriptorEdicion;
}
