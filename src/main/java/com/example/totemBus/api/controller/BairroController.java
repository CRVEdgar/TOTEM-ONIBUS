package com.example.totemBus.api.controller;

import com.example.totemBus.api.dto.BairroDTO;
import com.example.totemBus.model.entity.Bairro;
import com.example.totemBus.model.service.BairroService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

import static com.example.totemBus.api.core.MappinObjects.convertBairro;

@RestController
@RequestMapping("/bairro")
public class BairroController {

    private final BairroService service;

    public BairroController(BairroService service) {
        this.service = service;
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Bairro save(@RequestBody BairroDTO bairro){
        return service.salvar(convertBairro(bairro));
    }

    @GetMapping("/findAllDistricts")
    @ResponseStatus(HttpStatus.OK)
    public Set<Bairro> findAll(){
        return service.buscarTodos();
    }

    @GetMapping("/findDistrictByName/{name}")
    @ResponseStatus(HttpStatus.OK)
    public Bairro find(@RequestParam String name){
        return service.buscarPorNome(name);
    }
}
