package com.example.totemBus.model.service;

import com.example.totemBus.api.dto.ItinerarioDTO;
import com.example.totemBus.model.entity.Bairro;
import com.example.totemBus.model.entity.Itinerario;
import com.example.totemBus.model.entity.ItinerarioModelo;
import com.example.totemBus.model.entity.Onibus;
import com.example.totemBus.model.repository.BairroRepository;
import com.example.totemBus.model.repository.ItinerarioModeloRepository;
import com.example.totemBus.model.repository.ItinerarioRepository;
import com.example.totemBus.model.repository.OnibusRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ItinerarioService {

    private final OnibusRepository onibusRepository;

    private final BairroRepository bairroRepository;

    private final ItinerarioRepository repository;

    private final ItinerarioModeloRepository modeloRepository;

    public ItinerarioService(OnibusRepository onibusRepository, BairroRepository bairroRepository, ItinerarioRepository repository, ItinerarioModeloRepository modeloRepository) {
        this.onibusRepository = onibusRepository;
        this.bairroRepository = bairroRepository;
        this.repository = repository;
        this.modeloRepository = modeloRepository;
    }

    public List<ItinerarioDTO> montarItinerario(String linhaOnibus){
        LocalDateTime now = LocalDateTime.now();
        List<ItinerarioDTO> itinerarioDTOList = new ArrayList<>();

        ItinerarioModelo itinerarioDB = modeloRepository.findByOnibus(linhaOnibus);
        System.out.println("\n NOME DO ONIBUS LOCALIZADO: " + itinerarioDB.getOnibus());

        for(int i=0; i<8; i++){
            ItinerarioDTO itinerarioDTO = new ItinerarioDTO();
            itinerarioDTO.setReferencia( itinerarioDB.getItemItinerario().get(i).getReferencia() );
            itinerarioDTO.setLocal( itinerarioDB.getItemItinerario().get(i).getBairro() );
            itinerarioDTO.setTipo( itinerarioDB.getItemItinerario().get(i).getTipo() );
            itinerarioDTO.setHorario(now.plusMinutes(15));

            itinerarioDTOList.add(itinerarioDTO);
        }

        for(int i=0; i<8; i++){
            System.out.println("ITEM: " + itinerarioDTOList.get(i) );
        }


        return itinerarioDTOList;
    }

    private List<String> getNameBairros(Set<Bairro> bairros){
        List<String> namesBairros = new ArrayList<>();

        namesBairros = bairros.stream()
                .limit(8)
                .map(bairro -> bairro.getNome())
                .collect(Collectors.toList());

        return namesBairros;
    }


    public List<ItinerarioModelo> findAllModel(){
        return modeloRepository.findAll();
    }
}
