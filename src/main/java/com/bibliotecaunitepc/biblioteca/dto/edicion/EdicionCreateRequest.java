package com.bibliotecaunitepc.biblioteca.dto.edicion;

import com.bibliotecaunitepc.biblioteca.enums.Idioma;
import com.bibliotecaunitepc.biblioteca.enums.TipoEdicion;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class EdicionCreateRequest {
    @NotNull(message = "La edición es obligatoria")
    @Min(value = 1, message = "La edición debe ser mayor a 0")
    private Integer edicion;

    @Min(value = 1, message = "El volumen debe ser mayor a 0")
    private Integer volumen;

    @Min(value = 1, message = "Las páginas deben ser mayor a 0")
    private Integer paginas;

    @NotNull(message = "El idioma es obligatorio")
    private Idioma idioma;

    @NotNull(message = "El tipo de edición es obligatorio")
    private TipoEdicion tipoEdicion;

    @NotNull(message = "La fecha de publicación es obligatoria")
    private LocalDate fechaPublicacion;

    @NotBlank(message = "El ISBN es obligatorio")
    private String isbn;

    @NotBlank(message = "El código Dewey es obligatorio")
    private String dewey;

    @NotBlank(message = "El cutter es obligatorio")
    private String cutter;

    private String imagenUrl;

    private String notaEdicion;

    @NotNull(message = "El libro es obligatorio")
    private Long libroId;

    private List<Long> autorIds;

    @NotNull(message = "La editorial es obligatoria")
    private Long editorialId;

    private List<Long> descriptorIds;
}
