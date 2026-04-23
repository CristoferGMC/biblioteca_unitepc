package com.bibliotecaunitepc.biblioteca.dto.usuario;

import com.bibliotecaunitepc.biblioteca.enums.Estado;
import com.bibliotecaunitepc.biblioteca.enums.Rol;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioResponse {
    private Long id;
    private String ci;
    private String nombre;
    private String apellido;
    private String correo;
    private String usuario;
    private Rol rol;
    private Estado estado;
}
