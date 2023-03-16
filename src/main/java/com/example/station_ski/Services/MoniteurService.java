package com.example.station_ski.Services;

import com.example.station_ski.Entities.Cours;
import com.example.station_ski.Entities.Moniteur;
import com.example.station_ski.repositories.CoursRepository;
import com.example.station_ski.repositories.MoniteurRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class MoniteurService  implements IMoniteurService{
    @Autowired
    private MoniteurRepository moniteurRepository;
    @Autowired
    private CoursRepository coursRepository ;


    @Override
    public List<Moniteur> retrieveAllMoniteurs() {

        return moniteurRepository.findAll();
    }

    @Override
    public Moniteur addMoniteur(Moniteur e) {
        return (Moniteur) moniteurRepository.save(e);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur e) {
        return moniteurRepository.save(e);
    }

    @Override
    public Moniteur retrieveMoniteur(Integer idMoniteur) {
        return moniteurRepository.findById(idMoniteur).get();
    }

    @Override
    public void deleteMoniteur(Integer idMoniteur) {
        moniteurRepository.deleteById(idMoniteur);
    }

    @Override
    public Moniteur addMoniteurAndAssignToCourse(Moniteur moniteur, Long numCours) {
        Moniteur m =moniteurRepository.save(moniteur);
        Cours cours = coursRepository.findByNumCours(numCours);
        m.getCours().add(cours);
        moniteurRepository.save(m);
        return moniteur;
    }
}
