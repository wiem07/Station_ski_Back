package com.example.station_ski.Controller;
import com.example.station_ski.Entities.Abonnement;
import com.example.station_ski.Entities.Cours;
import com.example.station_ski.Entities.TypeAbonnement;
import com.example.station_ski.Services.CoursService;
import com.example.station_ski.Services.IAbonnementService;
import com.example.station_ski.Services.ICoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/Abonnement")
public class AbonnementController {

    @Autowired
    private IAbonnementService abonnementService;


    //http://localhost:8089/Abonnement/display-abonnement
    @GetMapping("/display-abonnement")
    public List<Abonnement> retrieveAllAbonnement() {

        return abonnementService.retrieveAllAbonnements();
    }
    //http://localhost:8089/Abonnement/get-abonnement/{id-abonnement}
    @GetMapping("/get-abonnement/{id-abonnement}")
    public Abonnement retrieveCours(@PathVariable("id-abonnement") Integer idAbonnement) {
        return abonnementService.retrieveAbonnement(idAbonnement);
    }
    //http://localhost:8089/Abonnement/create-abonnement
    @PostMapping("/create-abonnement")
    public Abonnement addCours(@RequestBody Abonnement abonnement) {
        return abonnementService.addAbonnement(abonnement);

    }
    //http://localhost:8089/Abonnement/update/{Abonnement-id}
    @PutMapping("/update/{id-cours}")
    public Abonnement updateCours(@PathVariable ("id-abonnement") Integer idAbonnement, @RequestBody Abonnement abonnement) {
        return abonnementService.updateAbonnement(abonnement);
    }
    //http://localhost:8089/Abonnement/delete/{abonnementId}
    @DeleteMapping("/delete/{id-abonnement}") // il faut que le meme pathparam idAbonnement
    public void deleteAbonnement(@PathVariable ("id-Aabonnement") Integer idAbonnement) {
        abonnementService.deleteAbonnement(idAbonnement);
    }
    @GetMapping("/getAbonnement/{type}")
    public Set<Abonnement> getAbonnementByType(@PathVariable("type") TypeAbonnement type) {
        return abonnementService.getAbonnementByType(type);
    }
}

