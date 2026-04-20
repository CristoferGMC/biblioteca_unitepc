package com.bibliotecaunitepc.biblioteca.model;

import com.bibliotecaunitepc.biblioteca.enums.TipoAdquisicion;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Adquisicion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private TipoAdquisicion tipoAdquisicion;
    private LocalDate fecha_adquisicion;
    private BigDecimal precio;
    private String proveedor;
}
