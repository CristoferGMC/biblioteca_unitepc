package com.bibliotecaunitepc.biblioteca.repository;

import com.bibliotecaunitepc.biblioteca.model.Edicion;
import com.bibliotecaunitepc.biblioteca.model.Ejemplar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EjemplarRepository extends JpaRepository<Ejemplar,Long> {
}
