package com.bibliotecaunitepc.biblioteca.repository;

import com.bibliotecaunitepc.biblioteca.model.Edicion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EdicionRepository extends JpaRepository<Edicion,Long> {
    //se puede poner los filters aqui o nueva funcionalidad aparte del que te da jpa
}
