package com.bibliotecaunitepc.biblioteca.service;

import com.bibliotecaunitepc.biblioteca.dto.prestamo.PrestamoCreateRequest;
import com.bibliotecaunitepc.biblioteca.dto.prestamo.PrestamoResponse;

import java.util.List;

public interface PrestamoService {
    PrestamoResponse create(PrestamoCreateRequest request);
    PrestamoResponse update(Long id);
    PrestamoResponse getById(Long id);
    List<PrestamoResponse> list();
}
