package org.sid.compteservice.controllers;

import org.sid.compteservice.entities.Compte;
import org.sid.compteservice.service.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comptes")
public class ComptesController {
    @Autowired
    private CompteService compteService;
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public List<Compte> GetAllComptes(){
       return compteService.GetAllComptes();
    }

}
