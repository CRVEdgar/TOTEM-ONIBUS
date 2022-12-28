package com.example.totemBus.model.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
public class Bairro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nome;

    @Column
    @ElementCollection(targetClass=String.class)
    private Set<String> ruas;

//    @Column
//    @ElementCollection(targetClass=String.class)
//    private Set<String> pontoReferencia;

    @OneToMany(mappedBy = "bairro")
    private Set<BairroPontoReferencia> bairroPontoReferencia;



    public Bairro() {
    }

    public Bairro(String nome, Set<String> ruas, Set<BairroPontoReferencia> bairroPontoReferencia) {
        this.nome = nome;
        this.ruas = ruas;
        this.bairroPontoReferencia = bairroPontoReferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<String> getRuas() {
        return ruas;
    }

    public void setRuas(Set<String> ruas) {
        this.ruas = ruas;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bairro)) return false;
        Bairro bairro = (Bairro) o;
        return getId().equals(bairro.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Bairro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", ruas=" + ruas +
                ", bairroPontoReferencia=" + bairroPontoReferencia +
                '}';
    }
}
