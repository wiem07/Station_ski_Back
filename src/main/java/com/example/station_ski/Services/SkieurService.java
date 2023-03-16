package com.example.station_ski.Services;
import com.example.station_ski.Entities.*;
import com.example.station_ski.repositories.CoursRepository;
import com.example.station_ski.repositories.PisteRepository;
import com.example.station_ski.repositories.SkieurRepository;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor

public class SkieurService  implements ISkieurService{
    private SkieurRepository skieurRepository;
    private PisteRepository pisteRepository;

    private CoursRepository coursRepository ;
    @Override
    public List<Skieur> retrieveAllSkieurs() {

        return skieurRepository.findAll();
    }

    @Override
    public Skieur addSkieur(Skieur s) {
        return (Skieur) skieurRepository.save(s);
    }

    @Override
    public Skieur updateSkieur(Skieur s) {
        return skieurRepository.save(s);
    }

    @Override
    public Skieur retrieveSkieur(Integer idSkieur) {
        return skieurRepository.findById(idSkieur).get();
    }

    @Override
    public void deleteSkieur(Integer idSkieur) {
        skieurRepository.deleteById(idSkieur);
    }

       @Override
       public Skieur assignSkieurToPiste(Long numSkieur, Long numPiste) {
           Skieur skieur = skieurRepository.findByNumSkieur(numSkieur);
           Piste piste = pisteRepository.findByNumPiste(numPiste);
           piste.getSkieurs().add(skieur); // tjs l'operation sur le parent

           return skieur;
       }
    @Override
    @Transactional
    public  Skieur addSkieurAndAssignToCours(Skieur skieur, Long numCours){
        Skieur s =skieurRepository.save(skieur);
        Cours cours=coursRepository.findByNumCours(numCours);
        Set<Inscription> inscriptions= new HashSet<>(); // pour ne pas faire des doublons
        inscriptions=s.getInscriptions();
        inscriptions.stream().forEach(inscription -> inscription.setCours(cours));     // pour parcourir une lite .stream
        // inscription.setSkieur(s) ;
        return skieur;
    }


    }

