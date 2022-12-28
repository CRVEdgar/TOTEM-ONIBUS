package com.example.totemBus.model.repository;

import com.example.totemBus.model.entity.ItinerarioModelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItinerarioModeloRepository extends JpaRepository<ItinerarioModelo, Long> {

    ItinerarioModelo findByOnibus(String onibus);
}
