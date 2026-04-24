package com.bibliotecaunitepc.biblioteca.repository;

import com.bibliotecaunitepc.biblioteca.model.Edicion;
import com.bibliotecaunitepc.biblioteca.model.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestamoRepository extends JpaRepository<Prestamo,Long> {
}
