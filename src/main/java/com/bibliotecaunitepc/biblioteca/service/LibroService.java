package com.bibliotecaunitepc.biblioteca.service;

import com.bibliotecaunitepc.biblioteca.dto.edicion.EdicionCreateRequest;
import com.bibliotecaunitepc.biblioteca.dto.edicion.EdicionResponse;
import com.bibliotecaunitepc.biblioteca.dto.libro.LibroCreateRequest;
import com.bibliotecaunitepc.biblioteca.dto.libro.LibroResponse;

import java.util.List;

public interface LibroService {
    LibroResponse crearLibro(LibroCreateRequest request);//registrar libro completo
    List<LibroResponse> listarLibros();
    List<LibroResponse> buscarLibros(String query);
    LibroResponse actualizarLibro(Long id);//actualizar libro completo
    LibroResponse obtenerLibroPorId(Long id);//obtener libro
    EdicionResponse agregarEdicion(EdicionCreateRequest request);
    List<EdicionResponse> listarEdiciones();
    void desactivarLibro(Long id);
}
