package com.bibliotecaunitepc.biblioteca.service;

import com.bibliotecaunitepc.biblioteca.dto.estudiante.EstudianteCreateRequest;
import com.bibliotecaunitepc.biblioteca.dto.estudiante.EstudianteResponse;

import java.util.List;

public interface EstudianteService {
    EstudianteResponse create(EstudianteCreateRequest request);
    EstudianteResponse update(Long id);
    EstudianteResponse getById(Long id);
    List<EstudianteResponse> list();
}
