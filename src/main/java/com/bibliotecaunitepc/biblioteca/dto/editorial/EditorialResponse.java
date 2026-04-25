package com.bibliotecaunitepc.biblioteca.dto.editorial;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class EditorialResponse {
    private Long id;
    private String nombre;
    private String Ciudad;
    private String pais;
}
