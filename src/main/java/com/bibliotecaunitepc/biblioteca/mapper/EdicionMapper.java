package com.bibliotecaunitepc.biblioteca.mapper;

import com.bibliotecaunitepc.biblioteca.dto.edicion.EdicionCreateRequest;
import com.bibliotecaunitepc.biblioteca.dto.edicion.EdicionResponse;
import com.bibliotecaunitepc.biblioteca.model.Autor;
import com.bibliotecaunitepc.biblioteca.model.Descriptor;
import com.bibliotecaunitepc.biblioteca.model.Edicion;

public class EdicionMapper {
    public Edicion toEntity(EdicionCreateRequest dto){
        Edicion e = new Edicion();
        e.setTituloEdicion(dto.getTituloEdicion());
        e.setDescripcionEdicion(dto.getDescripcionEdicion());
        e.setEdicion(dto.getEdicion());
        e.setVolumen(dto.getVolumen());
        e.setPaginas(dto.getPaginas());
        e.setIdioma(dto.getIdioma());
        e.setEdicionEspecial(dto.isEdicionEspecial());
        e.setFechaPublicacion(dto.getFechaPublicacion());
        e.setIsbn(dto.getIsbn());
        e.setDewey(dto.getDewey());
        e.setCutter(dto.getCutter());
        e.setImagenUrl(dto.getImagenUrl());
        return e;
    }
    public EdicionResponse toResponse(Edicion e){
        return EdicionResponse.builder()
                .id(e.getId())
                .tituloEdicion(e.getTituloEdicion())
                .descripcionEdicion(e.getDescripcionEdicion())
                .edicion(e.getEdicion())
                .volumen(e.getVolumen())
                .paginas(e.getPaginas())
                .idioma(e.getIdioma())
                .edicionEspecial(e.isEdicionEspecial())
                .fechaPublicacion(e.getFechaPublicacion())
                .isbn(e.getIsbn())
                .dewey(e.getDewey())
                .cutter(e.getCutter())
                .imagenUrl(e.getImagenUrl())
                .tituloOriginal(e.getLibro().getTituloOriginal())
                .autorResponseList(e.getAutores().stream().map(Autor::getNombre).toList())
                .nombreEditorial(e.getEditorial().getNombre())
                .descriptorResponseList(e.getDescriptorEdicion().stream().map(de -> de.getDescriptor().getNombre()).toList())
                .build();
    }
}
