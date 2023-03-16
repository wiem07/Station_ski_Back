package com.example.station_ski.Controller;
import com.example.station_ski.Entities.Cours;
import com.example.station_ski.Services.CoursService;
import com.example.station_ski.Services.ICoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Cours")
public class CoursController {

    @Autowired
    private ICoursService coursService;


    //http://localhost:8089/Cours/display-cours
    @GetMapping("/display-cours")
    public List<Cours> retrieveAllCours() {

        return coursService.retrieveAllCours();
    }
    //http://localhost:8089/Cours/get-cours/{id-cours}
    @GetMapping("/get-cours/{id-cours}")
    public Cours retrieveCours(@PathVariable("id-cours") Long idCours) {
        return coursService.retrieveCours(idCours);
    }
    //http://localhost:8089/cours/create-cours
    @PostMapping("/create-cours")
    public Cours addCours(@RequestBody Cours cours) {
        return coursService.addCours(cours);

    }
    //http://localhost:8089/Cours/update/{cours-id}
    @PutMapping("/update/{id-cours}")
    public Cours updateCours(@PathVariable ("id-cours") Long idCours, @RequestBody Cours cours) {
        return coursService.updateCours(cours);
    }
    //http://localhost:8089/Cours/delete/{coursId}
    @DeleteMapping("/delete/{id-cours}") // il faut que le meme pathparam idcours
    public void deleteCours(@PathVariable ("id-cours") Long idCours) {
        coursService.deleteCours(idCours);
    }
}

