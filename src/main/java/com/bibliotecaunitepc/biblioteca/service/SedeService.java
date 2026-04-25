package com.bibliotecaunitepc.biblioteca.service;

import com.bibliotecaunitepc.biblioteca.dto.sede.SedeCreateRequest;
import com.bibliotecaunitepc.biblioteca.dto.sede.SedeResponse;

import java.util.List;

public interface SedeService {
    SedeResponse create(SedeCreateRequest request);
    SedeResponse update(Long id);
    void delete(Long id);
    SedeResponse getById(Long id);
    List<SedeResponse> list();
}
