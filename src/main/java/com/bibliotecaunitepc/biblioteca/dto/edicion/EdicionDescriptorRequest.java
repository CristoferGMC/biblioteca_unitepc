package com.bibliotecaunitepc.biblioteca.dto.edicion;

import com.bibliotecaunitepc.biblioteca.enums.TipoDescriptor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class EdicionDescriptorRequest {
    private Long descriptorId;
    private TipoDescriptor tipoDescriptor;
}
