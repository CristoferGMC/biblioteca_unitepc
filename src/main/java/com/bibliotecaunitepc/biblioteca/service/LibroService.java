package com.bibliotecaunitepc.biblioteca.service;

import com.bibliotecaunitepc.biblioteca.dto.libro.LibroCreateRequest;
import com.bibliotecaunitepc.biblioteca.dto.libro.LibroResponse;

import java.util.List;

public interface LibroService {
    LibroResponse create(LibroCreateRequest request);
    LibroResponse update(Long id);
    void delete(Long id);
    LibroResponse getById(Long id);
    List<LibroResponse> list();
}
