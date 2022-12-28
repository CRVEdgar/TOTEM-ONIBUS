package com.example.totemBus.model.repository;

import com.example.totemBus.model.entity.Onibus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnibusRepository extends JpaRepository<Onibus, Long> {

    Onibus findByNome(String nome);
}
