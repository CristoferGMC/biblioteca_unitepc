package com.bibliotecaunitepc.biblioteca.mapper;

import com.bibliotecaunitepc.biblioteca.dto.campus.CampusCreateRequest;
import com.bibliotecaunitepc.biblioteca.dto.campus.CampusResponse;
import com.bibliotecaunitepc.biblioteca.enums.Estado;
import com.bibliotecaunitepc.biblioteca.model.Campus;

import java.util.List;

public class CampusMapper {
    public Campus toEntity(CampusCreateRequest dto){
        Campus c = new Campus();
        c.setNombre(dto.getNombre());
        c.setEstado(Estado.ACTIVO);
        return  c;
    }
    public CampusResponse toResponse(Campus c){
        return new CampusResponse(
                c.getId(),
                c.getNombre()
        );
    }
}
