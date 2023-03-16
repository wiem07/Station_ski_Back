package com.example.station_ski.repositories;

import com.example.station_ski.Entities.Abonnement;
import com.example.station_ski.Entities.Skieur;
import com.example.station_ski.Entities.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface AbonnementRepository extends JpaRepository<Abonnement, Integer> {
    @Query("SELECT a FROM Abonnement a WHERE a.typeAbon =:typeAbon order by a.dateDebut")
    Set<Abonnement> getAbonnementByType(@Param("typeAbon")TypeAbonnement type);
}
