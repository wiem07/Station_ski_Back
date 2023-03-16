package com.example.station_ski.Services;

import com.example.station_ski.Entities.Moniteur;

import java.util.List;


public interface IMoniteurService {
    List<Moniteur> retrieveAllMoniteurs();

    Moniteur addMoniteur(Moniteur e);

    Moniteur updateMoniteur (Moniteur e);

    Moniteur retrieveMoniteur (Integer idMoniteur);

    void deleteMoniteur(Integer idMoniteur);

    Moniteur addMoniteurAndAssignToCourse(Moniteur moniteur, Long numCours);

}
