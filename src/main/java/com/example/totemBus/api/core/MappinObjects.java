package com.example.totemBus.api.core;

import com.example.totemBus.api.dto.BairroDTO;
import com.example.totemBus.model.entity.Bairro;
import com.example.totemBus.model.entity.ItinerarioModelo;
import com.example.totemBus.model.entity.Onibus;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MappinObjects {

    public static final Bairro convertBairro(BairroDTO dto){
        Bairro newBairro = new Bairro();
        Set<String> ruas = new LinkedHashSet<>();

        String[] ruasSplit = dto.getRua().split(",");

        for(String rua: ruasSplit){
            ruas.add(rua);
        }

        newBairro.setNome(dto.getBairro());
        newBairro.setRuas(ruas);

        return newBairro;
    }

    public static final Set<String> convertListNomeBus(List<Onibus> onibusList){
        Set<String> namesBus = new LinkedHashSet<>();
        for(Onibus bus: onibusList){
            namesBus.add(bus.getNome());
        }
        return namesBus;
    }

    public static final Set<String> convertListNomeBusModel(List<ItinerarioModelo> onibusList){
        Set<String> namesBus = new LinkedHashSet<>();
        for(ItinerarioModelo bus: onibusList){
            namesBus.add(bus.getOnibus());
        }
        return namesBus;
    }
}
