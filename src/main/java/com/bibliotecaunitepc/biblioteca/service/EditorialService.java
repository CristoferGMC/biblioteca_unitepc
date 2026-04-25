package com.bibliotecaunitepc.biblioteca.service;

import com.bibliotecaunitepc.biblioteca.dto.editorial.EditorialCreateRequest;
import com.bibliotecaunitepc.biblioteca.dto.editorial.EditorialResponse;

import java.util.List;

public interface EditorialService {
    EditorialResponse create(EditorialCreateRequest request);
    EditorialResponse update(Long id);
    EditorialResponse getById(Long id);
    List<EditorialResponse> list();
}
