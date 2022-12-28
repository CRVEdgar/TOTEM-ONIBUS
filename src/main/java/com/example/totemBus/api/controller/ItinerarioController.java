package com.example.totemBus.api.controller;

import com.example.totemBus.api.dto.ItinerarioDTO;
import com.example.totemBus.model.entity.enums.Tipo_Item_Itinerario;
import com.example.totemBus.model.service.ItinerarioService;
import com.example.totemBus.model.service.OnibusService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static com.example.totemBus.api.core.MappinObjects.convertListNomeBus;
import static com.example.totemBus.api.core.MappinObjects.convertListNomeBusModel;

@RestController
@RequestMapping("/itinerario")
public class ItinerarioController {

    private final OnibusService onibusService;

    private final ItinerarioService service;

    public ItinerarioController(OnibusService onibusService, ItinerarioService service) {
        this.onibusService = onibusService;
        this.service = service;
    }

    @GetMapping("/findAllBus")
    @ResponseStatus(HttpStatus.OK)
    public Set<String> findAllBus(){

        return convertListNomeBusModel(service.findAllModel());
    }

    @GetMapping("/findByLinhaBus{linhaOnibus}{sentido}")
    @ResponseStatus(HttpStatus.OK)
    public List<ItinerarioDTO> findIntinerario(@RequestParam(value = "linhaOnibus") String linhaOnibus, @RequestParam(value = "sentido") String sentido ){

        System.out.println("OBJECT REQUEST: " + linhaOnibus + " || " + sentido);

        List<ItinerarioDTO> itinerarioDB = service.montarItinerario(linhaOnibus);

        if(sentido.equals("CENTRO")){
            return itinerarioDB;
        }else{

            List<ItinerarioDTO> invertList = new ArrayList<>();

            for(int i=itinerarioDB.size()-1; i>= 0; i--){
                invertList.add(itinerarioDB.get(i));
            }
            return invertList;
        }
//        ItinerarioDTO um = new ItinerarioDTO();
//        um.setLocal("vila nova");
//        um.setReferencia("ifma monte castelo");
//        um.setTipo(Tipo_Item_Itinerario.ESCOLA.toString());
//        um.setHorario(LocalDateTime.now());
//
//        ItinerarioDTO dois = new ItinerarioDTO();
//        dois.setLocal("vila vlha");
//        dois.setReferencia("ifma marana");
//        dois.setTipo(Tipo_Item_Itinerario.ESCOLA.toString());
//        dois.setHorario(LocalDateTime.now());
//
//        ItinerarioDTO tres = new ItinerarioDTO();
//        tres.setLocal("novo");
//        tres.setReferencia("ifma novo");
//        tres.setTipo(Tipo_Item_Itinerario.PONTO_TURISTICO.toString());
//        tres.setHorario(LocalDateTime.now());
//
//
//        itinerarioResponse.add(um);
//        itinerarioResponse.add(dois);
//        itinerarioResponse2.add(tres);

//        return itinerarioDB;

    }
}
