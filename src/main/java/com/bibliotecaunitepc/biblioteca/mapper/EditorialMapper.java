package com.bibliotecaunitepc.biblioteca.mapper;

import com.bibliotecaunitepc.biblioteca.dto.editorial.EditorialCreateRequest;
import com.bibliotecaunitepc.biblioteca.dto.editorial.EditorialResponse;
import com.bibliotecaunitepc.biblioteca.model.Editorial;

public class EditorialMapper {
    public Editorial toEntity(EditorialCreateRequest dto){
        Editorial e = new Editorial();
        e.setNombre(dto.getNombre());
        e.setCiudad(dto.getCiudad());
        e.setPais(dto.getPais());
        return e;
    }
    public EditorialResponse toResponse(Editorial e){
        return new EditorialResponse(
                e.getId(),
                e.getNombre(),
                e.getCiudad(),
                e.getPais()
        );
    }
}
