package com.bibliotecaunitepc.biblioteca.mapper;

import com.bibliotecaunitepc.biblioteca.dto.libro.LibroCreateRequest;
import com.bibliotecaunitepc.biblioteca.dto.libro.LibroResponse;
import com.bibliotecaunitepc.biblioteca.model.Libro;

public class LibroMapper {
    public Libro toEntity(LibroCreateRequest dto){
        Libro l = new Libro();
        l.setTituloOriginal(dto.getTituloOriginal());
        l.setTipoLibro(dto.getTipoLibro());
        return l;
    }
    public LibroResponse toResponse(Libro l){
        return new LibroResponse(
                l.getId(),
                l.getTituloOriginal(),
                l.getDescripcionGeneral(),
                l.getTipoLibro()
        );
    }
}
