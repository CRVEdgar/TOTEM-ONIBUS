package com.example.totemBus.model.service;

import com.example.totemBus.model.entity.Onibus;
import com.example.totemBus.model.repository.OnibusRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OnibusService {

    private final OnibusRepository repository;


    public OnibusService(OnibusRepository repository) {
        this.repository = repository;
    }

    public Onibus save(Onibus onibus){
        return repository.save(onibus);
    }

    public Onibus buscarPorId(Long id){
        return repository.findById(id).orElseThrow();
    }

    public Onibus bsucarPorNomeLinha(String nome){
        return repository.findByNome(nome);
    }

    public List<Onibus> buscarTodos(){
        List<Onibus> list =  repository.findAll();
        return list;
    }
}
