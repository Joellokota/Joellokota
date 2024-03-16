package com.cl.clientservice.entities;

import com.cl.clientservice.enumerateurs.TypeCustomer;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
@Entity
public class Customer {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String siren;
    private String siret;
    private String legalOwner;
    private String legalManager;
    private LocalDate dateCreation;
    private TypeCustomer typeCustomer;
}
