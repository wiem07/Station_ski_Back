package com.example.station_ski.Services;

import com.example.station_ski.Entities.Inscription;


import java.util.List;


public interface IInscriptionService {
    List<Inscription> retrieveAllInscriptions();

    Inscription addInscription(Inscription I);

    Inscription updateInscription (Inscription I);

    Inscription  retrieveInscription (Integer idInscription);

    void deleteInscription(Integer idInscription);
    Inscription assignInscriptionToCours(Long numInscription, Long numCours) ;



}
