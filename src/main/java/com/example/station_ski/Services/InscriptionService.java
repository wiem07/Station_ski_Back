package com.example.station_ski.Services;
import com.example.station_ski.Entities.Cours;
import com.example.station_ski.Entities.Inscription;
import com.example.station_ski.Entities.Piste;
import com.example.station_ski.Entities.Skieur;
import com.example.station_ski.repositories.CoursRepository;
import com.example.station_ski.repositories.InscriptionRepository;
import com.example.station_ski.repositories.SkieurRepository;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class InscriptionService  implements IInscriptionService{
    private InscriptionRepository inscriptionRepository;
    private CoursRepository coursRepository;
    @Override
    public List<Inscription> retrieveAllInscriptions() {

        return inscriptionRepository.findAll();
    }

    @Override
    public Inscription addInscription(Inscription I) {

        return (Inscription) inscriptionRepository.save(I);
    }

    @Override
    public Inscription updateInscription(Inscription I) {
        return inscriptionRepository.save(I);
    }

    @Override
    public Inscription retrieveInscription(Integer idInscription) {
        return inscriptionRepository.findById(idInscription).get();
    }

    @Override
    public void deleteInscription(Integer idInscription) {
        inscriptionRepository.deleteById(idInscription);

    }
    @Override
    public Inscription assignInscriptionToCours(Long numInscription, Long numCours) {
        Inscription inscription = inscriptionRepository.findByNumInscription(numInscription);
        Cours cours = coursRepository.findByNumCours(numCours);
        inscription.setCours(cours); // set s'effectue sur le pere  tjrs on met le parent.set si on a la relation manytone et .get si manytomany
        return inscription;
    }



}

