package com.bibliotecaunitepc.biblioteca.dto.editorial;

import com.bibliotecaunitepc.biblioteca.model.Edicion;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class EditorialCreateRequest {
    @NotBlank(message = "el nombre es obligatorio")
    @Size(max = 255, message = "El nombre no puede superar 255 caracteres")
    private String nombre;
    @NotBlank(message = "el pais es obligatorio")
    @Size(max = 255, message = "El pais no puede superar 255 caracteres")
    private String pais;
    @NotBlank(message = "La ciudad es obligatoria")
    @Size(max = 255, message = "La ciudad no puede superar 255 caracteres")
    private String ciudad;
}
