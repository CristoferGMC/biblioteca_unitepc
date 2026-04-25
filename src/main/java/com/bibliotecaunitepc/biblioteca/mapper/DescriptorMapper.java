package com.bibliotecaunitepc.biblioteca.mapper;

import com.bibliotecaunitepc.biblioteca.dto.descriptor.DescriptorCreateRequest;
import com.bibliotecaunitepc.biblioteca.dto.descriptor.DescriptorResponse;
import com.bibliotecaunitepc.biblioteca.model.Descriptor;

public class DescriptorMapper {
    public Descriptor toEntity(DescriptorCreateRequest dto){
        Descriptor d = new Descriptor();
        d.setNombre(dto.getNombre());
        return d;
    }
    public DescriptorResponse toResponse(Descriptor d){
        return new DescriptorResponse(
                d.getId(),
                d.getNombre()
        );
    }

}
