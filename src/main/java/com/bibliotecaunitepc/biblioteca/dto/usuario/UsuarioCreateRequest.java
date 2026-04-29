package com.bibliotecaunitepc.biblioteca.dto.usuario;

import com.bibliotecaunitepc.biblioteca.enums.Estado;
import com.bibliotecaunitepc.biblioteca.enums.Rol;
import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioCreateRequest {
    private String usuario;
    private String contrasena;
    private Rol rol;
}
