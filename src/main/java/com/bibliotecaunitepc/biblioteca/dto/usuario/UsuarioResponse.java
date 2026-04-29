package com.bibliotecaunitepc.biblioteca.dto.usuario;

import com.bibliotecaunitepc.biblioteca.enums.Estado;
import com.bibliotecaunitepc.biblioteca.enums.Rol;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioResponse {
    private Long id;
    private String usuario;
    private Rol rol;
    private Estado estado;
}
