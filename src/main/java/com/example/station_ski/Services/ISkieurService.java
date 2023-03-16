package com.example.station_ski.Services;

import com.example.station_ski.Entities.Skieur;

import java.util.List;


public interface ISkieurService {
    List<Skieur> retrieveAllSkieurs();

    Skieur addSkieur(Skieur s);

    Skieur updateSkieur (Skieur s);

    Skieur retrieveSkieur (Integer idSkieur);

    void deleteSkieur(Integer idSkieur);
    Skieur assignSkieurToPiste(Long numSkieur, Long numPiste);
    Skieur addSkieurAndAssignToCours(Skieur skieur, Long numCours);


}
