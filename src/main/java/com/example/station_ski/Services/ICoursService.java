package com.example.station_ski.Services;
import com.example.station_ski.Entities.Cours;
import java.util.List;


public interface ICoursService {
    List<Cours> retrieveAllCours();

    Cours addCours(Cours c);

    Cours updateCours (Cours c);

    Cours retrieveCours (Long idCours);

    void deleteCours(Long idCours);


}
