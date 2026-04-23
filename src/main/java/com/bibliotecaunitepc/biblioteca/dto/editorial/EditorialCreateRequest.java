package com.bibliotecaunitepc.biblioteca.dto.editorial;

import com.bibliotecaunitepc.biblioteca.model.Edicion;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class EditorialCreateRequest {
    private String nombre;
    private String pais;
    private String Ciudad;
}
