package com.example.totemBus.model.entity;

import javax.persistence.*;

@Entity
public class ReferenciaTipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String referencia;

    private String tipo;

    private String bairro;

    @ManyToOne
    @JoinColumn(name = "itinerario_id", nullable=false)
    private ItinerarioModelo itinerarioModelo;

    public Long getId() {
        return id;
    }


    public ReferenciaTipo() {
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ItinerarioModelo getItinerarioModelo() {
        return itinerarioModelo;
    }

    public void setItinerarioModelo(ItinerarioModelo itinerarioModelo) {
        this.itinerarioModelo = itinerarioModelo;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
