package com.bibliotecaunitepc.biblioteca.dto.personal;

import com.bibliotecaunitepc.biblioteca.dto.usuario.UsuarioResponse;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonalResponse {
    private Long id;
    private String ci;
    private String nombre;
    private String apellido;
    private String celular;
    private String correo;

    private UsuarioResponse usuario;
}
