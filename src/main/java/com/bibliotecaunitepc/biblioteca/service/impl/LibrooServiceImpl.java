package com.bibliotecaunitepc.biblioteca.service.impl;

import com.bibliotecaunitepc.biblioteca.dto.libro.LibroCreateRequest;
import com.bibliotecaunitepc.biblioteca.dto.libro.LibroResponse;
import com.bibliotecaunitepc.biblioteca.mapper.LibroMapper;
import com.bibliotecaunitepc.biblioteca.model.Libro;
import com.bibliotecaunitepc.biblioteca.repository.LibroRepository;
import com.bibliotecaunitepc.biblioteca.service.LibrooService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibrooServiceImpl implements LibrooService {
    private final LibroRepository libroRepository;
    private final LibroMapper libroMapper;

    public LibrooServiceImpl(LibroRepository libroRepository, LibroMapper libroMapper) {
        this.libroRepository = libroRepository;
        this.libroMapper = libroMapper;
    }

    @Override
    public LibroResponse create(LibroCreateRequest request) {
        Libro l = libroMapper.toEntity(request);
        return libroMapper.toResponse(libroRepository.save(l));
    }

    @Override
    public LibroResponse update(Long id) {
        return null;
    }

    @Override
    public LibroResponse getById(Long id) {
        Libro l = libroRepository.findById(id).orElse(null);
        if(l==null) return null;
        return libroMapper.toResponse(l);
    }

    @Override
    public List<LibroResponse> list() {
        return libroRepository.findAll().stream().map(libroMapper::toResponse).toList();
    }
}
