package com.example.station_ski.repositories;

import com.example.station_ski.Entities.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface SkieurRepository extends JpaRepository<Skieur,Integer > {
    Skieur findByNumSkieur(Long numSkieur);

}
