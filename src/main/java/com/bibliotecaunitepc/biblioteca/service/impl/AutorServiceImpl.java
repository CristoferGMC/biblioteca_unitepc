package com.bibliotecaunitepc.biblioteca.service.impl;

import com.bibliotecaunitepc.biblioteca.dto.autor.AutorCreateRequest;
import com.bibliotecaunitepc.biblioteca.dto.autor.AutorResponse;
import com.bibliotecaunitepc.biblioteca.mapper.AutorMapper;
import com.bibliotecaunitepc.biblioteca.model.Autor;
import com.bibliotecaunitepc.biblioteca.repository.AutorRepository;
import com.bibliotecaunitepc.biblioteca.service.AutorService;

import java.util.List;

public class AutorServiceImpl implements AutorService {
    private final AutorRepository autorRepository;
    private final AutorMapper autorMapper;

    public AutorServiceImpl(AutorRepository autorRepository, AutorMapper autorMapper) {
        this.autorRepository = autorRepository;
        this.autorMapper = autorMapper;
    }

    @Override
    public AutorResponse create(AutorCreateRequest request) {
        Autor a = autorMapper.toEntity(request);
        return autorMapper.toResponse(a);
    }

    @Override
    public AutorResponse update(Long id) {
        return null;
    }

    @Override
    public AutorResponse getById(Long id) {
        Autor a = autorRepository.findById(id).orElse(null);
        if (a==null) return null;
        return autorMapper.toResponse(a);
    }

    @Override
    public List<AutorResponse> list() {
        return autorRepository.findAll().stream().map(autorMapper::toResponse).toList();
    }
}
