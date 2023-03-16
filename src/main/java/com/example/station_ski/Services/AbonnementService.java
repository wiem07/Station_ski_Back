package com.example.station_ski.Services;
import com.example.station_ski.Entities.Abonnement;
import com.example.station_ski.Entities.TypeAbonnement;
import com.example.station_ski.repositories.AbonnementRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor

public class AbonnementService  implements IAbonnementService{

    private AbonnementRepository abonnementRepository;

    @Override
    public List<Abonnement> retrieveAllAbonnements() {

        return abonnementRepository.findAll();
    }

    @Override
    public Abonnement addAbonnement(Abonnement A) {
        return (Abonnement) abonnementRepository.save(A);
    }
    @Override
    public Abonnement updateAbonnement(Abonnement A) {
        return abonnementRepository.save(A);
    }
    @Override
    public Abonnement retrieveAbonnement(Integer idAbonnement) {
        return abonnementRepository.findById(idAbonnement).get();
    }
    @Override
    public void deleteAbonnement(Integer idAbonnement) {
        abonnementRepository.deleteById(idAbonnement);
    }
    @Override
    public Set<Abonnement> getAbonnementByType(TypeAbonnement type) {
        return abonnementRepository.getAbonnementByType(type);
    }
}
