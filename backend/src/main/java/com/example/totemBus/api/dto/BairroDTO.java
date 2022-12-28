package com.example.totemBus.api.dto;

public class BairroDTO {

    private String bairro;
    private String rua ;

    public BairroDTO() {
    }

    public BairroDTO(String bairro, String rua) {
        this.bairro = bairro;
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}
