package com.example.station_ski.repositories;

import com.example.station_ski.Entities.Cours;
import com.example.station_ski.Entities.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CoursRepository extends JpaRepository<Cours, Long> {

   Cours findByNumCours(Long numCours);
   @Query("SELECT s FROM Skieur s WHERE s.numSkieur=:numSkieur" )
   Skieur retrieveSkieurByNum(@Param("numSkieur") Long numSkieur);
}
