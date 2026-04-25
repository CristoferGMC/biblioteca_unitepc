package com.bibliotecaunitepc.biblioteca.mapper;

import com.bibliotecaunitepc.biblioteca.dto.adquisicion.AdquisicionCreateRequest;
import com.bibliotecaunitepc.biblioteca.dto.adquisicion.AdquisicionResponse;
import com.bibliotecaunitepc.biblioteca.model.Adquisicion;
import org.springframework.stereotype.Component;

@Component
public class AdquisicionMapper {
    public Adquisicion toEntity(AdquisicionCreateRequest dto) {
        Adquisicion a = new Adquisicion();
        a.setProveedor(dto.getProveedor());
        a.setFecha_adquisicion(dto.getFecha_adquisicion());
        a.setPrecio(dto.getPrecio());
        a.setTipoAdquisicion(dto.getTipoAdquisicion());
        return a;
    }

    public AdquisicionResponse toResponse(Adquisicion a) {
        return new AdquisicionResponse(
                a.getId(),
                a.getProveedor(),
                a.getFecha_adquisicion(),
                a.getTipoAdquisicion()
        );
    }
}
