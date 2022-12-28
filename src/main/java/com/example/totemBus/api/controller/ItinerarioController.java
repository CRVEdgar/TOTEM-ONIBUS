package com.example.totemBus.api.controller;

import com.example.totemBus.api.dto.ItinerarioDTO;
import com.example.totemBus.api.dto.OnibusListDTO;
import com.example.totemBus.api.dto.OnibusRequest;
import com.example.totemBus.model.entity.Onibus;
import com.example.totemBus.model.entity.enums.Tipo_Item_Itinerario;
import com.example.totemBus.model.service.OnibusService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static com.example.totemBus.api.core.MappinObjects.convertListNomeBus;

@RestController
@RequestMapping("/itinerario")
public class ItinerarioController {

    private final OnibusService onibusService;

    public ItinerarioController(OnibusService onibusService) {
        this.onibusService = onibusService;
    }

    @GetMapping("/findAllBus")
    @ResponseStatus(HttpStatus.OK)
    public Set<String> findAllBus(){

        return convertListNomeBus(onibusService.buscarTodos());
    }

    @GetMapping("/findByLinhaBus{linhaOnibus}{sentido}")
    @ResponseStatus(HttpStatus.OK)
    public List<ItinerarioDTO> findIntinerario(@RequestParam(value = "linhaOnibus") String linhaOnibus, @RequestParam(value = "sentido") String sentido ){

        System.out.println("OBJECT REQUEST: " + linhaOnibus + " || " + sentido);

        List<ItinerarioDTO> itinerarioResponse = new ArrayList<>();

        List<ItinerarioDTO> itinerarioResponse2 = new ArrayList<>();



        ItinerarioDTO um = new ItinerarioDTO();
        um.setLocal("vila nova");
        um.setReferencia("ifma monte castelo");
        um.setTipo(Tipo_Item_Itinerario.ESCOLA.toString());
        um.setHorario(LocalDateTime.now());

        ItinerarioDTO dois = new ItinerarioDTO();
        dois.setLocal("vila vlha");
        dois.setReferencia("ifma marana");
        dois.setTipo(Tipo_Item_Itinerario.ESCOLA.toString());
        dois.setHorario(LocalDateTime.now());

        ItinerarioDTO tres = new ItinerarioDTO();
        tres.setLocal("novo");
        tres.setReferencia("ifma novo");
        tres.setTipo(Tipo_Item_Itinerario.PONTO_TURISTICO.toString());
        tres.setHorario(LocalDateTime.now());


        itinerarioResponse.add(um);
        itinerarioResponse.add(dois);
        itinerarioResponse2.add(tres);

        if(linhaOnibus.equals("Vila Raposa")){
            return itinerarioResponse2;
        }
        return itinerarioResponse;
    }
}