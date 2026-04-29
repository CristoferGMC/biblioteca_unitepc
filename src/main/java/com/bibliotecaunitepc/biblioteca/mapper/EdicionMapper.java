package com.bibliotecaunitepc.biblioteca.mapper;

import com.bibliotecaunitepc.biblioteca.dto.edicion.EdicionCreateRequest;
import com.bibliotecaunitepc.biblioteca.dto.edicion.EdicionResponse;
import com.bibliotecaunitepc.biblioteca.dto.editorial.EditorialResponse;
import com.bibliotecaunitepc.biblioteca.dto.libro.LibroResponse;
import com.bibliotecaunitepc.biblioteca.model.Autor;
import com.bibliotecaunitepc.biblioteca.model.Descriptor;
import com.bibliotecaunitepc.biblioteca.model.Edicion;

public class EdicionMapper {
    private final EditorialMapper editorialMapper;
    private final DescriptorMapper descriptorMapper;

    public EdicionMapper(EditorialMapper editorialMapper, DescriptorMapper descriptorMapper) {
        this.editorialMapper = editorialMapper;
        this.descriptorMapper = descriptorMapper;
    }

    public Edicion toEntity(EdicionCreateRequest dto){
        Edicion e = new Edicion();
        e.setEdicion(dto.getEdicion());
        e.setVolumen(dto.getVolumen());
        e.setPaginas(dto.getPaginas());
        e.setIdioma(dto.getIdioma());
        e.setTipoEdicion(dto.getTipoEdicion());
        e.setFechaPublicacion(dto.getFechaPublicacion());
        e.setIsbn(dto.getIsbn());
        e.setDewey(dto.getDewey());
        e.setCutter(dto.getCutter());
        e.setImagenUrl(dto.getImagenUrl());
        e.setNotaEdicion(dto.getNotaEdicion());
        return e;
    }
    public EdicionResponse toResponse(Edicion e){
        return EdicionResponse.builder()
                .id(e.getId())
                .titulo(e.getLibro().getTituloOriginal())
                .descripcion(e.getLibro().getDescripcionGeneral())
                .edicion(e.getEdicion())
                .volumen(e.getVolumen())
                .paginas(e.getPaginas())
                .idioma(e.getIdioma())
                .tipoEdicion(e.getTipoEdicion())
                .fechaPublicacion(e.getFechaPublicacion())
                .isbn(e.getIsbn())
                .dewey(e.getDewey())
                .cutter(e.getCutter())
                .imagenUrl(e.getImagenUrl())
                .notaEdicion(e.getNotaEdicion())

                .autores(e.getAutores().stream().map(Autor::getNombre).toList())
                .editorial(editorialMapper.toResponse(e.getEditorial()))
                .descriptores(e.getDescriptorEdicion().stream().map(
                        d->descriptorMapper.toResponse(d.getDescriptor()))
                        .toList())
                .build();
    }
}
