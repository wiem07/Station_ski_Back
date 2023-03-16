package com.example.station_ski.Controller;


import com.example.station_ski.Entities.Piste;

import com.example.station_ski.Services.IPisteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Piste")
public class PisteController {

    @Autowired
    private IPisteService pisteService;


    //http://localhost:8089/Piste/display-piste
    @GetMapping("/display-Piste")
    public List<Piste> retrieveAllPistes() {

        return pisteService.retrieveAllPistes();
    }
    //http://localhost:8089/Piste/get-piste/{id-piste}
    @GetMapping("/get-piste/{id-piste}")
    public Piste retrievePiste(@PathVariable("id-piste") Integer idPiste) {
        return pisteService.retrievePiste(idPiste);
    }
    //http://localhost:8089/Piste/create-piste
    @PostMapping("/create-Piste")
    public Piste addMoniteur(@RequestBody Piste piste) {
        return pisteService.addPiste(piste);

    }
    //http://localhost:8089/Piste/update/{piste-id}
    @PutMapping("/update/{id-Piste}")
    public Piste updatePiste(@PathVariable ("id-Piste") Integer idPiste, @RequestBody Piste piste) {
        return pisteService.updatePiste(piste);
    }
    //http://localhost:8089/Piste/delete/{PisteId}
    @DeleteMapping("/delete/{id-Piste}") // il faut que le meme pathparam idInscription
    public void deletePiste(@PathVariable ("id-piste") Integer idPiste) {
        pisteService.deletePiste(idPiste);
    }
}

