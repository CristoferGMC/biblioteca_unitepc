package com.bibliotecaunitepc.biblioteca.dto.edicion;

import com.bibliotecaunitepc.biblioteca.enums.TipoEdicion;
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
    private int edicion;
    private int volumen;
    private int paginas;
    private String idioma;
    private TipoEdicion tipoEdicion;
    private LocalDate fechaPublicacion;
    private String isbn;
    private String dewey;
    private String cutter;
    private String imagenUrl;
    private String notaEdicion;
    private Long libroId;
    //MannyToMany
    private List<Long> autorIds;
    private Long editorialId;
    //OneToManyTablaIntermedia
    private List<Long> descriptorIds;
}
