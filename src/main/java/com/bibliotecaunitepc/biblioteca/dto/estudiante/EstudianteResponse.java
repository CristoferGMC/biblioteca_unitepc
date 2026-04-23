package com.bibliotecaunitepc.biblioteca.dto.estudiante;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EstudianteResponse {
    private Long id;
    private int codigoEstudiante;
    private String nombre;
    private String apellido;
    private String Carrera;
    private String celular;
    private String correo;
}
