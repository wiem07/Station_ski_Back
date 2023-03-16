package com.example.station_ski.Controller;




import com.example.station_ski.Entities.Skieur;

import com.example.station_ski.Services.ISkieurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Skieur")
public class SkieurController {

    @Autowired
    private ISkieurService skieurService;


    //http://localhost:8089/Skieur/display-skieur
    @GetMapping("/display-Skieur")
    public List<Skieur> retrieveAllSkieurs() {

        return skieurService.retrieveAllSkieurs();
    }
    //http://localhost:8089/Skieur/get-skieur/{id-skieur}
    @GetMapping("/get-skieur/{id-skieur}")
    public Skieur retrieveSkieur(@PathVariable("id-skieur") Integer idSkieur) {
        return skieurService.retrieveSkieur(idSkieur);
    }
    //http://localhost:8089/Skieur/create-skieur
    @PostMapping("/create-Piste")
    public Skieur addSkieur(@RequestBody Skieur skieur) {
        return skieurService.addSkieur(skieur);

    }
    //http://localhost:8089/Skieur/update/{skieur-id}
    @PutMapping("/update/{id-Skieur}")
    public Skieur updateSkieur(@PathVariable ("id-Piste") Integer idSkieur, @RequestBody Skieur skieur) {
        return skieurService.updateSkieur(skieur);
    }
    //http://localhost:8089/Piste/delete/{PisteId}
    @DeleteMapping("/delete/{id-Skieur}") // il faut que le meme pathparam idInscription
    public void deleteSkieur(@PathVariable ("id-Skieur") Integer idSkieur) {
        skieurService.deleteSkieur(idSkieur);
    }
     @PostMapping("/piste/{numPiste}/{numSkieur}")
    public Skieur assignSkieurToPiste(@PathVariable ("numPiste") Long numPiste, @PathVariable ("numSkieur") Long numSkieur) {
       return  skieurService.assignSkieurToPiste(numPiste, numSkieur);
     }
    @PostMapping("/addSkieurAndAssignToCourse")
    public Skieur addSkieurAndAssignToCourse(@RequestBody Skieur skieur, Long numCours) {
        return skieurService.addSkieurAndAssignToCours(skieur, numCours);
    }
}


