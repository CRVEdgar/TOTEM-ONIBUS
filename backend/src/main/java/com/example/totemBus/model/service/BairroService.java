package com.example.totemBus.model.service;



import com.example.totemBus.model.entity.Bairro;
import com.example.totemBus.model.repository.BairroRepository;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class BairroService {

    private final BairroRepository repository;

    public BairroService(BairroRepository repository) {
        this.repository = repository;
    }

    public Bairro salvar(Bairro bairro){
        return repository.save(bairro);
    }

    public Set<Bairro> buscarTodos(){
        Set<Bairro> bairros = new LinkedHashSet<>();
        bairros.addAll(repository.findAll());

        return bairros;
    }

    public Bairro buscarPorNome(String nome){
        return repository.findByNome(nome).orElseThrow();
    }
}
