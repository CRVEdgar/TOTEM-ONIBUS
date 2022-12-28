package com.example.totemBus.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class ItinerarioModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String onibus;

    @OneToMany(mappedBy = "itinerarioModelo")
    private List<ReferenciaTipo> itemItinerario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ItinerarioModelo() {
    }

    public String getOnibus() {
        return onibus;
    }

    public void setOnibus(String onibus) {
        this.onibus = onibus;
    }

    public List<ReferenciaTipo> getItemItinerario() {
        return itemItinerario;
    }

    public void setItemItinerario(List<ReferenciaTipo> itemItinerario) {
        this.itemItinerario = itemItinerario;
    }
}
