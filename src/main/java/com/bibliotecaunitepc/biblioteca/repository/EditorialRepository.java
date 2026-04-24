package com.bibliotecaunitepc.biblioteca.repository;

import com.bibliotecaunitepc.biblioteca.model.Edicion;
import com.bibliotecaunitepc.biblioteca.model.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EditorialRepository extends JpaRepository<Editorial,Long> {
}
