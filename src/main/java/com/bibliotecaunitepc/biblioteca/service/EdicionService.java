package com.bibliotecaunitepc.biblioteca.service;

import com.bibliotecaunitepc.biblioteca.dto.edicion.EdicionCreateRequest;
import com.bibliotecaunitepc.biblioteca.dto.edicion.EdicionResponse;

import java.util.List;

public interface EdicionService {
    EdicionResponse create(EdicionCreateRequest request);
    EdicionResponse update(Long id);
    void delete(Long id);
    EdicionResponse getById(Long id);
    List<EdicionResponse> list();
}
