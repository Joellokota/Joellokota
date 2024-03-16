package com.cl.etablissementservice.entities;

import com.cl.etablissementservice.enumerateurs.TypeEtablissement;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter @Setter @Builder @AllArgsConstructor @NoArgsConstructor @ToString
public class Etablishment {
    @Id
    private String id;
    private String name;
    private TypeEtablissement typeBuilding;
    private String address;
    private LocalDate creationDate;
}
