package org.sid.compteservice.service;

import org.sid.compteservice.entities.Compte;
import org.sid.compteservice.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompteService {
    @Autowired
    private CompteRepository compteRepository;

    public List<Compte> GetAllComptes(){
        return compteRepository.findAll();
    }

}
