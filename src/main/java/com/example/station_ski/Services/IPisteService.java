package com.example.station_ski.Services;

import com.example.station_ski.Entities.Piste;
import java.util.List;


public interface IPisteService {
    List<Piste> retrieveAllPistes();

    Piste addPiste(Piste p);

    Piste updatePiste (Piste p);

    Piste retrievePiste (Integer idPiste);

    void deletePiste(Integer idPiste);


}
