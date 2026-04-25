package com.bibliotecaunitepc.biblioteca.service;

import com.bibliotecaunitepc.biblioteca.dto.ejemplar.EjemplarCreateRequest;
import com.bibliotecaunitepc.biblioteca.dto.ejemplar.EjemplarResponse;

import java.util.List;

public interface EjemplarService {
    EjemplarResponse create(EjemplarCreateRequest request);
    EjemplarResponse update(Long id);
    void delete(Long id);
    EjemplarResponse getById(Long id);
    List<EjemplarResponse> list();
}
