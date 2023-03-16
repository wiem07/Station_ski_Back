package com.example.station_ski.Services;
import com.example.station_ski.Entities.Piste;
import com.example.station_ski.repositories.PisteRepository;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class PisteService  implements IPisteService{
    private PisteRepository pisteRepository;
    @Override
    public List<Piste> retrieveAllPistes() {

        return pisteRepository.findAll();
    }

    @Override
    public Piste addPiste(Piste p) {
        return (Piste) pisteRepository.save(p);
    }

    @Override
    public Piste updatePiste(Piste p) {
        return pisteRepository.save(p);
    }

    @Override
    public Piste retrievePiste(Integer idPiste) {
        return
                pisteRepository.findById(idPiste).get();
    }

    @Override
    public void deletePiste(Integer idPiste) {
        pisteRepository.deleteById(idPiste);

    }


}

