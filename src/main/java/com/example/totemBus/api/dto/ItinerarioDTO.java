package com.example.totemBus.api.dto;

import java.time.LocalDateTime;

public class ItinerarioDTO {

    private String local; //nomeBairro
    private String referencia;

    private String tipo;

    private LocalDateTime horario;

    public ItinerarioDTO() {
    }

    public ItinerarioDTO(String local, String referencia, String tipo, LocalDateTime horario) {
        this.local = local;
        this.referencia = referencia;
        this.tipo = tipo;
        this.horario = horario;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
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

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "ItinerarioDTO{" +
                "local='" + local + '\'' +
                ", referencia='" + referencia + '\'' +
                ", tipo='" + tipo + '\'' +
                ", horario=" + horario +
                '}';
    }
}
