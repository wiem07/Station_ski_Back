package com.example.station_ski.repositories;

import com.example.station_ski.Entities.Piste;
import com.example.station_ski.Entities.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PisteRepository extends JpaRepository<Piste, Integer> {
    Piste findByNumPiste(Long numPiste);

}
