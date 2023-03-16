package com.example.station_ski.repositories;

import com.example.station_ski.Entities.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscriptionRepository extends JpaRepository <Inscription , Integer> {
    Inscription findByNumInscription(Long numInscription);
}
