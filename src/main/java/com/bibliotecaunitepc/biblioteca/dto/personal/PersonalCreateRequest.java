package com.bibliotecaunitepc.biblioteca.dto.personal;

import com.bibliotecaunitepc.biblioteca.dto.usuario.UsuarioCreateRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonalCreateRequest {
    private String ci;
    private String nombre;
    private String apellido;
    private String celular;
    private String correo;
    private Long campusId;

    private UsuarioCreateRequest usuario;
}
