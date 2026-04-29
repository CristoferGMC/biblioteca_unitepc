package com.bibliotecaunitepc.biblioteca.mapper;

import com.bibliotecaunitepc.biblioteca.dto.prestamo.PrestamoCreateRequest;
import com.bibliotecaunitepc.biblioteca.dto.prestamo.PrestamoResponse;
import com.bibliotecaunitepc.biblioteca.enums.EstadoPrestamo;
import com.bibliotecaunitepc.biblioteca.model.Prestamo;

public class PrestamoMapper {
    public Prestamo toEntity(PrestamoCreateRequest dto){
        Prestamo p = new Prestamo();
        p.setEstadoPrestamo(EstadoPrestamo.ACTIVO);
        p.setTipoPrestamo(dto.getTipoPrestamo());
        return p;
    }
    public PrestamoResponse toResponse(Prestamo p){
        return PrestamoResponse.builder()
                .id(p.getId())
                .fechaPrestamo(p.getFechaPrestamo())
                .estadoPrestamo(p.getEstadoPrestamo())
                .tipoPrestamo(p.getTipoPrestamo())
                .personal(p.getPersonal().getNombre())
                .estudiante(p.getEstudiante().getNombre())

                .ejemplarCodigos(p.getDetallePrestamos().stream().map(dP->dP.getEjemplar().getCodigoInventario()).toList())
                .build();
    }
}
