package com.bibliotecaunitepc.biblioteca.service.impl;

import com.bibliotecaunitepc.biblioteca.dto.adquisicion.AdquisicionCreateRequest;
import com.bibliotecaunitepc.biblioteca.dto.adquisicion.AdquisicionResponse;
import com.bibliotecaunitepc.biblioteca.repository.AdquisicionRepository;
import com.bibliotecaunitepc.biblioteca.service.AdquisicionService;

import java.util.List;

public class AdquisicionServiceImpl implements AdquisicionService {
    private final AdquisicionRepository adquisicionRepository;

    public AdquisicionServiceImpl(AdquisicionRepository adquisicionRepository) {
        this.adquisicionRepository = adquisicionRepository;
    }

    @Override
    public AdquisicionResponse create(AdquisicionCreateRequest request) {
        return adquisicionRepository(AdquisicionCreateRequest);
    }

    @Override
    public AdquisicionResponse getById(Long id) {
        return null;
    }

    @Override
    public List<AdquisicionResponse> list() {
        return List.of();
    }
}
