package com.bibliotecaunitepc.biblioteca.mapper;

import com.bibliotecaunitepc.biblioteca.dto.autor.AutorCreateRequest;
import com.bibliotecaunitepc.biblioteca.dto.autor.AutorResponse;
import com.bibliotecaunitepc.biblioteca.model.Autor;
import org.springframework.stereotype.Component;

@Component
public class AutorMapper {
    public Autor toEntity(AutorCreateRequest dto){
        Autor a = new Autor();
        a.setNombre(dto.getNombre());
        a.setTipoAutor(dto.getTipoAutor());
        return a;
    }
    public AutorResponse toResponse(Autor a){
        return new AutorResponse(
                a.getId(),
                a.getNombre(),
                a.getTipoAutor()
        );
    }
}
