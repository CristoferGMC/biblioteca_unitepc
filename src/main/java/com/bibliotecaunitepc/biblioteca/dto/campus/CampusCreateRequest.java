package com.bibliotecaunitepc.biblioteca.dto.campus;

import com.bibliotecaunitepc.biblioteca.enums.Estado;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class CampusCreateRequest {
    private String nombre;
    private Long sedeId;
}
