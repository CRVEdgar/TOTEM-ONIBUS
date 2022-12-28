package com.example.totemBus.model.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Set;

@Entity
public class Onibus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nome;

    @OneToMany
    private Set<Bairro> bairros;
    private LocalDateTime hrSaida;
    private LocalDateTime hrChegada;

    private Double tarifa;
    private String cor;

    public Onibus() {
    }

    public Onibus(String nome, Set<Bairro> bairros, LocalDateTime hrSaida, LocalDateTime hrChegada, Double tarifa, String cor) {
        this.nome = nome;
        this.bairros = bairros;
        this.hrSaida = hrSaida;
        this.hrChegada = hrChegada;
        this.tarifa = tarifa;
        this.cor = cor;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Bairro> getBairros() {
        return bairros;
    }

    public void setBairros(Set<Bairro> bairros) {
        this.bairros = bairros;
    }

    public LocalDateTime getHrSaida() {
        return hrSaida;
    }

    public void setHrSaida(LocalDateTime hrSaida) {
        this.hrSaida = hrSaida;
    }

    public LocalDateTime getHrChegada() {
        return hrChegada;
    }

    public void setHrChegada(LocalDateTime hrChegada) {
        this.hrChegada = hrChegada;
    }

    public Double getTarifa() {
        return tarifa;
    }

    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Onibus)) return false;
        Onibus onibus = (Onibus) o;
        return getId().equals(onibus.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
