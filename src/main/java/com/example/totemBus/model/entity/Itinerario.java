package com.example.totemBus.model.entity;

import com.example.totemBus.model.entity.enums.Sentido;

import javax.persistence.*;
import java.util.List;

@Entity
public class Itinerario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToOne
    private Onibus onibus;

    @OneToMany
    private List<ItemItinerario> itinerarioList;

    private Sentido sentido;

    public Itinerario() {
    }

    public Itinerario(Onibus onibus, List<ItemItinerario> itinerarioList, Sentido sentido) {
        this.onibus = onibus;
        this.itinerarioList = itinerarioList;
        this.sentido = sentido;
    }

    public Long getId() {
        return id;
    }

    public Onibus getOnibus() {
        return onibus;
    }

    public void setOnibus(Onibus onibus) {
        this.onibus = onibus;
    }

    public List<ItemItinerario> getItinerarioList() {
        return itinerarioList;
    }

    public void setItinerarioList(List<ItemItinerario> itinerarioList) {
        this.itinerarioList = itinerarioList;
    }

    public Sentido getSentido() {
        return sentido;
    }

    public void setSentido(Sentido sentido) {
        this.sentido = sentido;
    }

    @Override
    public String toString() {
        return "Itinerario{" +
                "id=" + id +
                ", onibus=" + onibus +
                ", itinerarioList=" + itinerarioList +
                ", sentido=" + sentido +
                '}';
    }
}
