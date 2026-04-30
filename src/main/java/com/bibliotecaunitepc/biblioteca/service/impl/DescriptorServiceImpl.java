package com.bibliotecaunitepc.biblioteca.service.impl;

import com.bibliotecaunitepc.biblioteca.dto.descriptor.DescriptorCreateRequest;
import com.bibliotecaunitepc.biblioteca.dto.descriptor.DescriptorResponse;
import com.bibliotecaunitepc.biblioteca.mapper.DescriptorMapper;
import com.bibliotecaunitepc.biblioteca.model.Descriptor;
import com.bibliotecaunitepc.biblioteca.repository.DescriptorRepository;
import com.bibliotecaunitepc.biblioteca.service.DescriptorService;

import java.util.List;

public class DescriptorServiceImpl implements DescriptorService {
    private final DescriptorRepository descriptorRepository;
    private final DescriptorMapper descriptorMapper;

    public DescriptorServiceImpl(DescriptorRepository descriptorRepository, DescriptorMapper descriptorMapper) {
        this.descriptorRepository = descriptorRepository;
        this.descriptorMapper = descriptorMapper;
    }

    @Override
    public DescriptorResponse create(DescriptorCreateRequest request) {
        Descriptor d = descriptorMapper.toEntity(request);
        return descriptorMapper.toResponse(descriptorRepository.save(d));
    }

    @Override
    public DescriptorResponse getById(Long id) {
        Descriptor d = descriptorRepository.findById(id).orElse(null);
        if(d==null) return null;
        return descriptorMapper.toResponse(d);
    }

    @Override
    public List<DescriptorResponse> list() {
        return descriptorRepository.findAll().stream().map(descriptorMapper::toResponse).toList();
    }
}
