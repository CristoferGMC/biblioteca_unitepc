package com.bibliotecaunitepc.biblioteca.service.impl;

import com.bibliotecaunitepc.biblioteca.dto.adquisicion.AdquisicionCreateRequest;
import com.bibliotecaunitepc.biblioteca.dto.adquisicion.AdquisicionResponse;
import com.bibliotecaunitepc.biblioteca.mapper.AdquisicionMapper;
import com.bibliotecaunitepc.biblioteca.model.Adquisicion;
import com.bibliotecaunitepc.biblioteca.repository.AdquisicionRepository;
import com.bibliotecaunitepc.biblioteca.service.AdquisicionService;

import java.util.List;

public class AdquisicionServiceImpl implements AdquisicionService {
    private final AdquisicionRepository adquisicionRepository;
    private final AdquisicionMapper adquisicionMapper;

    public AdquisicionServiceImpl(AdquisicionRepository adquisicionRepository, AdquisicionMapper adquisicionMapper) {
        this.adquisicionRepository = adquisicionRepository;
        this.adquisicionMapper = adquisicionMapper;
    }

    @Override
    public AdquisicionResponse create(AdquisicionCreateRequest request) {
        Adquisicion a = adquisicionMapper.toEntity(request);
        return adquisicionMapper.toResponse(adquisicionRepository.save(a));
    }

    @Override
    public AdquisicionResponse getById(Long id) {
        Adquisicion a = adquisicionRepository.findById(id).orElse(null);
        if(a == null) return null;
        return adquisicionMapper.toResponse(a);
    }

    @Override
    public List<AdquisicionResponse> list() {
        return adquisicionRepository.findAll().stream().map(adquisicionMapper::toResponse).toList();
    }
}
