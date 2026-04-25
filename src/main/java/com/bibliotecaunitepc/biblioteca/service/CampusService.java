package com.bibliotecaunitepc.biblioteca.service;

import com.bibliotecaunitepc.biblioteca.dto.campus.CampusCreateRequest;
import com.bibliotecaunitepc.biblioteca.dto.campus.CampusResponse;

import java.util.List;

public interface CampusService {
    CampusResponse create(CampusCreateRequest request);
    CampusResponse update(Long id);
    void delete(Long id);
    CampusResponse getById(Long id);
    List<CampusResponse> list();
}
