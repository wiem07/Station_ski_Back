package com.example.station_ski.Services;

import com.example.station_ski.Entities.Abonnement;
import com.example.station_ski.Entities.TypeAbonnement;


import java.util.List;
import java.util.Set;


public interface IAbonnementService {
    List<Abonnement> retrieveAllAbonnements();

    Abonnement addAbonnement (Abonnement A);

    Abonnement updateAbonnement (Abonnement A);

    Abonnement retrieveAbonnement (Integer idAbonnement);

    void deleteAbonnement(Integer idAbonnement);
    Set<Abonnement> getAbonnementByType(TypeAbonnement type);



}
