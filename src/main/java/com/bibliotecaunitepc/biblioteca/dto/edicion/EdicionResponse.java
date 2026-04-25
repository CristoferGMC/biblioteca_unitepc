package com.bibliotecaunitepc.biblioteca.dto.edicion;

import com.bibliotecaunitepc.biblioteca.dto.autor.AutorResponse;
import com.bibliotecaunitepc.biblioteca.dto.descriptor.DescriptorResponse;
import com.bibliotecaunitepc.biblioteca.model.DescriptorEdicion;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter @Setter
@Builder
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
    //libroId
    private String tituloOriginal;
    private List<String> autorResponseList;//traer nombre de los autores
    private String nombreEditorial;
    //OneToManyTablaIntermedia
    private List<String> descriptorResponseList;
}
