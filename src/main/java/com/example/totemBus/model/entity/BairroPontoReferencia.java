package com.example.totemBus.model.entity;

import com.example.totemBus.model.entity.enums.Tipo_Item_Itinerario;

import javax.persistence.*;

@Entity
public class BairroPontoReferencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nome;

    private Tipo_Item_Itinerario tipo;

    @ManyToOne
    @JoinColumn(name = "bairroPontoReferencia_id", nullable=false)
    private Bairro bairro;

    public Long getId() {
        return id;
    }

    public BairroPontoReferencia() {
    }

    public BairroPontoReferencia(String nome, Tipo_Item_Itinerario tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
}
