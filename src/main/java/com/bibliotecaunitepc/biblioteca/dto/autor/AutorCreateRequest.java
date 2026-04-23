package com.bibliotecaunitepc.biblioteca.dto.autor;

import com.bibliotecaunitepc.biblioteca.enums.TipoAutor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AutorCreateRequest {
    private String nombre;
    private TipoAutor tipoAutor;
}
