package com.bibliotecaunitepc.biblioteca.dto.sede;

import com.bibliotecaunitepc.biblioteca.enums.Estado;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class SedeResponse {
    private Long id;
    private String nombre;
    private Estado estado;
}
