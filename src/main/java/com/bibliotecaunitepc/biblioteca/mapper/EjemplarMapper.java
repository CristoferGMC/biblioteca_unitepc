package com.bibliotecaunitepc.biblioteca.mapper;

import com.bibliotecaunitepc.biblioteca.dto.ejemplar.EjemplarCreateRequest;
import com.bibliotecaunitepc.biblioteca.dto.ejemplar.EjemplarResponse;
import com.bibliotecaunitepc.biblioteca.enums.EstadoEjemplar;
import com.bibliotecaunitepc.biblioteca.model.Ejemplar;

public class EjemplarMapper {
    public Ejemplar toEntity(EjemplarCreateRequest dto){
        Ejemplar e = new Ejemplar();
        e.setComentario(dto.getComentario());
        e.setEstadoEjemplar(EstadoEjemplar.DISPONIBLE);
        e.setTipoEjemplar(dto.getTipoEjemplar());
        e.setFechaIngreso(dto.getFechaIngreso());
        return e;
    }
    public EjemplarResponse toResponse(Ejemplar e){
        return EjemplarResponse.builder()
                .id(e.getId())
                .titulo(e.getEdicion().getLibro().getTituloOriginal())
                .edicion(e.getEdicion().getEdicion())
                .codigoEjemplar(e.getCodigoInventario())
                .comentario(e.getComentario())
                .estadoEjemplar(e.getEstadoEjemplar())
                .tipoEjemplar(e.getTipoEjemplar())
                .fechaIngreso(e.getFechaIngreso())
                .build();
    }
}
