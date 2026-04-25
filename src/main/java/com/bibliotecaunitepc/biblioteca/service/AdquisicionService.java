package com.bibliotecaunitepc.biblioteca.service;

import com.bibliotecaunitepc.biblioteca.dto.adquisicion.AdquisicionCreateRequest;
import com.bibliotecaunitepc.biblioteca.dto.adquisicion.AdquisicionResponse;

import java.util.List;

public interface AdquisicionService {
    AdquisicionResponse create(AdquisicionCreateRequest request);
    AdquisicionResponse getById(Long id);
    List<AdquisicionResponse> list();
}
