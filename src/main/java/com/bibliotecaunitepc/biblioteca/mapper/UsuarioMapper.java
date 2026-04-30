package com.bibliotecaunitepc.biblioteca.mapper;

import com.bibliotecaunitepc.biblioteca.dto.usuario.UsuarioCreateRequest;
import com.bibliotecaunitepc.biblioteca.model.Usuario;

public class UsuarioMapper {
    public Usuario toEntity(UsuarioCreateRequest dto){
        Usuario u = new Usuario();
        u.setUsuario(u.getUsuario());
        u.setContrasena(dto.getContrasena());
        return u;
    };
}
