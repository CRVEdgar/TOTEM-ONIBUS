package com.example.totemBus.model.service;

import com.example.totemBus.model.entity.Itinerario;
import com.example.totemBus.model.entity.Onibus;
import com.example.totemBus.model.repository.BairroRepository;
import com.example.totemBus.model.repository.OnibusRepository;
import org.springframework.stereotype.Service;

@Service
public class ItinerarioService {

    private final OnibusRepository onibusRepository;

    private final BairroRepository bairroRepository;

    public ItinerarioService(OnibusRepository onibusRepository, BairroRepository bairroRepository) {
        this.onibusRepository = onibusRepository;
        this.bairroRepository = bairroRepository;
    }

    public Itinerario montarItinerario(String linhaOnibus){
        Itinerario itinerario = new Itinerario();

        Onibus onibus = onibusRepository.findByNome(linhaOnibus);

        itinerario.setOnibus(onibus);

        return itinerario;
    }
}
