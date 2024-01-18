package org.sid.compteservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.compteservice.enums.TypeCompte;

import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
//pour les getters et les setters avec lombok, un constructeur sans argument et un constucteur avec argument
public class Compte {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;
    private double solde;
    private Date dateCreation;
    @Enumerated(EnumType.STRING)
    private TypeCompte typeCompte;
}
