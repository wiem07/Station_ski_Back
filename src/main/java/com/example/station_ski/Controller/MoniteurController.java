package com.example.station_ski.Controller;
import com.example.station_ski.Entities.Moniteur;
import com.example.station_ski.Entities.Skieur;
import com.example.station_ski.Services.IMoniteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RestController
@RequestMapping("/Moniteur")
public class MoniteurController {

    @Autowired
    private IMoniteurService moniteurService;


    //http://localhost:8089/Inscription/display-moniteur
    @GetMapping("/display-Moniteur")
    public List<Moniteur> retrieveAllMoniteur() {

        return moniteurService.retrieveAllMoniteurs();
    }
    //http://localhost:8089/Moniteur/get-moniteur/{id-moniteur}
    @GetMapping("/get-moniteur/{id-moniteur}")
    public Moniteur retrieveMoniteur(@PathVariable("id-moniteur") Integer idMoniteur) {
        return moniteurService.retrieveMoniteur(idMoniteur);
    }
    //http://localhost:8089/Moniteur/create-inscription
    @PostMapping("/create-Moniteur")
    public Moniteur addMoniteur(@RequestBody Moniteur moniteur) {
        return moniteurService.addMoniteur(moniteur);

    }
    //http://localhost:8089/Moniteur/update/{moniteur-id}
    @PutMapping("/update/{id-Moniteur}")
    public Moniteur updateMoniteur(@PathVariable ("id-Moniteur") Integer idMoniteur, @RequestBody Moniteur moniteur) {
        return moniteurService.updateMoniteur(moniteur);
    }
    //http://localhost:8089/Moniteur/delete/{moniteurId}
    @DeleteMapping("/delete/{id-moniteur}") // il faut que le meme pathparam idInscription
    public void deleteMoniteur(@PathVariable ("id-moniteur") Integer idMoniteur) {
        moniteurService.deleteMoniteur(idMoniteur);
    }
    @PutMapping("/moniteur/assign")
    public Moniteur addMoniteurAndAssignToCourse(@RequestBody Moniteur moniteur, Long numCours) {
        return  moniteurService.addMoniteurAndAssignToCourse(moniteur,numCours);
    }
}

