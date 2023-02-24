package com.example.station_ski.repositories;

import com.example.station_ski.Entities.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface SkieurRepository extends JpaRepository<Skieur,Integer > {

}
