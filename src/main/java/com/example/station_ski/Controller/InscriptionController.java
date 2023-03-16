package com.example.station_ski.Controller;
import com.example.station_ski.Entities.Cours;
import com.example.station_ski.Entities.Inscription;
import com.example.station_ski.Entities.Skieur;
import com.example.station_ski.Services.CoursService;
import com.example.station_ski.Services.ICoursService;
import com.example.station_ski.Services.IInscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Inscription")
public class InscriptionController {

    @Autowired
    private IInscriptionService inscriptionService;


    //http://localhost:8089/Inscription/display-inscription
    @GetMapping("/display-inscription")
    public List<Inscription> retrieveAllInscription() {

        return inscriptionService.retrieveAllInscriptions();
    }
    //http://localhost:8089/Inscription/get-inscription/{id-inscription}
    @GetMapping("/get-inscription/{id-inscription}")
    public Inscription retrieveInscription(@PathVariable("id-inscription") Integer idInscription) {
        return inscriptionService.retrieveInscription(idInscription);
    }
    //http://localhost:8089/inscription/create-inscription
    @PostMapping("/create-Inscription")
    public Inscription addInscription(@RequestBody Inscription inscription) {
        return inscriptionService.addInscription(inscription);

    }
    //http://localhost:8089/Inscription/update/{cours-id}
    @PutMapping("/update/{id-inscription}")
    public Inscription updateInscription(@PathVariable ("id-inscription") Integer idInscription, @RequestBody Inscription inscription) {
        return inscriptionService.updateInscription(inscription);
    }
    //http://localhost:8089/Inscription/delete/{inscriptionId}
    @DeleteMapping("/delete/{id-inscription}") // il faut que le meme pathparam idnscription
    public void deleteInscription(@PathVariable ("id-inscription") Integer idInscription) {
        inscriptionService.deleteInscription(idInscription);
    }
    @PutMapping("/piste/{numInscription}/{numCours}")
    public Inscription assignInscriptionToCours(@PathVariable ("numInscription") Long numInscription, @PathVariable ("numCours") Long numCours) {
        return  inscriptionService.assignInscriptionToCours(numInscription, numCours);
    }
}

