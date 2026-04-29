package com.bibliotecaunitepc.biblioteca.mapper;

import com.bibliotecaunitepc.biblioteca.dto.estudiante.EstudianteCreateRequest;
import com.bibliotecaunitepc.biblioteca.dto.estudiante.EstudianteResponse;
import com.bibliotecaunitepc.biblioteca.model.Estudiante;

public class EstudianteMapper {
    public Estudiante toEntity(EstudianteCreateRequest dto)
    {
        Estudiante e = new Estudiante();
        e.setNombre(dto.getNombre());
        e.setApellido(dto.getApellido());
        e.setCarrera(dto.getCarrera());
        e.setCelular(dto.getCelular());
        e.setCorreo(dto.getCorreo());
        return e;
    }
    public EstudianteResponse toResponse(Estudiante e){
        return EstudianteResponse.builder()
                .id(e.getId())
                .codigoEstudiante(e.getCodigoEstudiante())
                .nombre(e.getNombre())
                .apellido(e.getApellido())
                .carrera(e.getCarrera())
                .celular(e.getCelular())
                .correo(e.getCorreo())
                .build();
    }
}
