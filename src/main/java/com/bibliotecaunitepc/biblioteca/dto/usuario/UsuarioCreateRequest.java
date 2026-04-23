package com.bibliotecaunitepc.biblioteca.dto.usuario;

import com.bibliotecaunitepc.biblioteca.enums.Estado;
import com.bibliotecaunitepc.biblioteca.enums.Rol;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioCreateRequest {
    private String ci;
    private String nombre;
    private String apellido;
    private String correo;
    private String usuario;
    private String contrasena;
    private Rol rol;
    private Estado estado;
    private Long campusId;
}
