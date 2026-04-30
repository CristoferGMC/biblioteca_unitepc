package com.bibliotecaunitepc.biblioteca.dto.libro;

import com.bibliotecaunitepc.biblioteca.enums.TipoLibro;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class LibroCreateRequest {
    @NotBlank(message = "El título es obligatorio")
    @Size(max = 255, message = "El título no puede superar 255 caracteres")
    private String tituloOriginal;
    @Size(max = 1000, message = "La descripción es muy larga")
    private String descripcionGeneral;
    @NotNull(message = "El tipo de libro es obligatorio")
    private TipoLibro tipoLibro;
}
