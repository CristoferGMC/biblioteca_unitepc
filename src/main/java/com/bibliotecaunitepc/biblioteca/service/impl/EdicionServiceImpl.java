package com.bibliotecaunitepc.biblioteca.service.impl;

import com.bibliotecaunitepc.biblioteca.dto.edicion.EdicionCreateRequest;
import com.bibliotecaunitepc.biblioteca.dto.edicion.EdicionResponse;
import com.bibliotecaunitepc.biblioteca.mapper.EdicionMapper;
import com.bibliotecaunitepc.biblioteca.model.Edicion;
import com.bibliotecaunitepc.biblioteca.repository.EdicionRepository;
import com.bibliotecaunitepc.biblioteca.service.EdicionService;

import java.util.List;

public class EdicionServiceImpl implements EdicionService {
    private final EdicionRepository edicionRepository;
    private final EdicionMapper edicionMapper;

    public EdicionServiceImpl(EdicionRepository edicionRepository, EdicionMapper edicionMapper) {
        this.edicionRepository = edicionRepository;
        this.edicionMapper = edicionMapper;
    }

    @Override
    public EdicionResponse create(EdicionCreateRequest request) {
        //crear descripctor
        //crear autor
        //crear libro
        Edicion e = edicionRepository.save(edicionMapper.toEntity(request));
        return null;
    }

    @Override
    public EdicionResponse update(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public EdicionResponse getById(Long id) {
        return null;
    }

    @Override
    public List<EdicionResponse> list() {
        return List.of();
    }
}
