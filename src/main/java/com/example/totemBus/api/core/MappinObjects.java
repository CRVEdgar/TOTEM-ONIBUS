package com.example.totemBus.api.core;

import com.example.totemBus.api.dto.BairroDTO;
import com.example.totemBus.model.entity.Bairro;

import java.util.LinkedHashSet;
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
}
