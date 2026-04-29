package com.bibliotecaunitepc.biblioteca.mapper;

import com.bibliotecaunitepc.biblioteca.dto.personal.PersonalCreateRequest;
import com.bibliotecaunitepc.biblioteca.dto.personal.PersonalResponse;
import com.bibliotecaunitepc.biblioteca.dto.usuario.UsuarioResponse;
import com.bibliotecaunitepc.biblioteca.model.Personal;

public class PersonalMapper {
    public Personal toEntity(PersonalCreateRequest dto){
        Personal p = new Personal();
        p.setCi(dto.getCi());
        p.setNombre(dto.getNombre());
        p.setApellido(dto.getApellido());
        p.setCelular(dto.getCelular());
        p.setCorreo(dto.getCorreo());
        return p;
    }
    public PersonalResponse toResponse(Personal p){
        return PersonalResponse.builder()
                .ci(p.getCi())
                .nombre(p.getNombre())
                .apellido(p.getApellido())
                .celular(p.getCelular())
                .correo(p.getCorreo())
                .usuario(UsuarioResponse.builder()
                        .id(p.getUsuario().getId())
                        .usuario(p.getUsuario().getUsuario())
                        .rol(p.getUsuario().getRol())
                        .estado(p.getUsuario().getEstado())
                        .build()
                )
                .build();
    }
}
