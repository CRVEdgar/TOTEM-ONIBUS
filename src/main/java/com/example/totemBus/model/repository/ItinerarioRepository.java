package com.example.totemBus.model.repository;

import com.example.totemBus.model.entity.Itinerario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItinerarioRepository extends JpaRepository<Itinerario, Long> {

    Itinerario findByOnibus_Nome(String nome);
}
