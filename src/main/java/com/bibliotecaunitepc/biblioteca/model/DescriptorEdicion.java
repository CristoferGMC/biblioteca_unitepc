package com.bibliotecaunitepc.biblioteca.model;

import com.bibliotecaunitepc.biblioteca.enums.TipoDescriptor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.naming.Name;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class DescriptorEdicion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoDescriptor tipoDescriptor;
    @ManyToOne
    @JoinColumn(name = "descriptor_id")
    private Descriptor descriptor;
    @ManyToOne
    @JoinColumn(name = "edicion_id")
    private Edicion edicion;
}
