package com.bibliotecaunitepc.biblioteca.mapper;

import com.bibliotecaunitepc.biblioteca.dto.ejemplar.EjemplarCreateRequest;
import com.bibliotecaunitepc.biblioteca.enums.EstadoEjemplar;
import com.bibliotecaunitepc.biblioteca.model.Ejemplar;

public class EjemplarMapper {
    public Ejemplar toEntity(EjemplarCreateRequest dto){
        Ejemplar e = new Ejemplar();
        e.setComentario(dto.getComentario());
        e.setEstadoEjemplar(EstadoEjemplar.DISPONIBLE);
        e.setFechaIngreso(dto.getFechaIngreso());
        return e;
    }
}
