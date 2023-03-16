package com.example.station_ski.Services;
import com.example.station_ski.Entities.Cours;
import com.example.station_ski.repositories.CoursRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@AllArgsConstructor

public class CoursService  implements ICoursService{

    private CoursRepository coursRepository;

    @Override
    public List<Cours> retrieveAllCours() {

        return coursRepository.findAll();
    }

    @Override
    public Cours addCours(Cours c) {
        return (Cours) coursRepository.save(c);
    }
    @Override
    public Cours updateCours(Cours c) {

        return coursRepository.save(c);
    }
    @Override
    public Cours retrieveCours(Long idCours) {
        return coursRepository.findById(idCours).get();
    }
    @Override
    public void deleteCours(Long idCours) {
        coursRepository.deleteById(idCours);


    }

}
