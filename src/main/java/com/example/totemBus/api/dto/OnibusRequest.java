package com.example.totemBus.api.dto;

import com.example.totemBus.model.entity.enums.Sentido;

public class OnibusRequest {

    private String linhaOnibus;
    private Sentido sentido;

    public OnibusRequest() {
    }

    public OnibusRequest(String nome, Sentido sentido) {
        this.linhaOnibus = nome;
        this.sentido = sentido;
    }

    public String getNome() {
        return linhaOnibus;
    }

    public void setNome(String nome) {
        this.linhaOnibus = nome;
    }

    public Sentido getSentido() {
        return sentido;
    }

    public void setSentido(Sentido sentido) {
        this.sentido = sentido;
    }


    @Override
    public String toString() {
        return "OnibusRequest{" +
                "linhaOnibus='" + linhaOnibus + '\'' +
                ", sentido=" + sentido +
                '}';
    }
}
