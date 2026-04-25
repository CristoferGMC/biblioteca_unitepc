package com.bibliotecaunitepc.biblioteca.service;

import com.bibliotecaunitepc.biblioteca.dto.autor.AutorCreateRequest;
import com.bibliotecaunitepc.biblioteca.dto.autor.AutorResponse;

import java.util.List;

public interface AutorService {
    AutorResponse create(AutorCreateRequest request);
    AutorResponse update(Long id);
    AutorResponse getById(Long id);
    List<AutorResponse> list();
}
