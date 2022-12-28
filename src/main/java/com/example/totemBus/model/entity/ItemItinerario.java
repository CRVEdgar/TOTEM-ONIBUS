package com.example.totemBus.model.entity;

import com.example.totemBus.model.entity.enums.Tipo_Item_Itinerario;

import javax.persistence.*;

@Entity
public class ItemItinerario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private Tipo_Item_Itinerario tipo;

    private String nome;

    private int sequencia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
