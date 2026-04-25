package com.bibliotecaunitepc.biblioteca.service;

import com.bibliotecaunitepc.biblioteca.dto.usuario.UsuarioCreateRequest;
import com.bibliotecaunitepc.biblioteca.dto.usuario.UsuarioResponse;

import java.util.List;

public interface UsuarioService {
    UsuarioResponse create(UsuarioCreateRequest request);
    UsuarioResponse update(Long id);
    void delete(Long id);
    UsuarioResponse getById(Long id);
    List<UsuarioResponse> list();
}
