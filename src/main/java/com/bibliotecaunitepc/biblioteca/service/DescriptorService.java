package com.bibliotecaunitepc.biblioteca.service;

import com.bibliotecaunitepc.biblioteca.dto.descriptor.DescriptorCreateRequest;
import com.bibliotecaunitepc.biblioteca.dto.descriptor.DescriptorResponse;

import java.util.List;

public interface DescriptorService {
    DescriptorResponse create(DescriptorCreateRequest request);
    DescriptorResponse getById(Long id);
    List<DescriptorResponse> list();
}
