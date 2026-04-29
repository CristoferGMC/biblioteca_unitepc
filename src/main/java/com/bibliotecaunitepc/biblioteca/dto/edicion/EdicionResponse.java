package com.bibliotecaunitepc.biblioteca.dto.edicion;

import com.bibliotecaunitepc.biblioteca.dto.autor.AutorResponse;
import com.bibliotecaunitepc.biblioteca.dto.descriptor.DescriptorResponse;
import com.bibliotecaunitepc.biblioteca.dto.editorial.EditorialResponse;
import com.bibliotecaunitepc.biblioteca.dto.libro.LibroResponse;
import com.bibliotecaunitepc.biblioteca.enums.TipoEdicion;
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
    private String titulo;
    private String descripcion;
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
    //autores
    private List<String> autores;//traer nombre de los autores
    //editorial
    private EditorialResponse editorial;
    //OneToManyTablaIntermedia
    private List<DescriptorResponse> descriptores;
}
