package com.bibliotecaunitepc.biblioteca.mapper;

import com.bibliotecaunitepc.biblioteca.dto.sede.SedeCreateRequest;
import com.bibliotecaunitepc.biblioteca.dto.sede.SedeResponse;
import com.bibliotecaunitepc.biblioteca.enums.Estado;
import com.bibliotecaunitepc.biblioteca.model.Sede;

public class SedeMapper {
    public Sede toEntity(SedeCreateRequest dto){
        Sede s = new Sede();
        s.setNombre(dto.getNombre());
        s.setEstado(Estado.ACTIVO);
        return s;
    }
    public SedeResponse toResponse(Sede s){
        return new SedeResponse(
                s.getId(),
                s.getNombre(),
                s.getEstado()
        );
    }
}
