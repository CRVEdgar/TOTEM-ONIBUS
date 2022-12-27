package com.example.totemBus.model.service;



import com.example.totemBus.model.entity.Bairro;
import com.example.totemBus.model.repository.BairroRepository;
import org.springframework.stereotype.Service;

@Service
public class BairroService {

    private final BairroRepository repository;

    public BairroService(BairroRepository repository) {
        this.repository = repository;
    }

    public Bairro salvar(Bairro bairro){
        return repository.save(bairro);
    }


}
