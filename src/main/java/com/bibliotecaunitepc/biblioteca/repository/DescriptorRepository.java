package com.bibliotecaunitepc.biblioteca.repository;

import com.bibliotecaunitepc.biblioteca.model.Descriptor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DescriptorRepository extends JpaRepository<Descriptor,Long> {
}
