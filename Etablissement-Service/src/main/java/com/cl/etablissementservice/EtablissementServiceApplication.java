package com.cl.etablissementservice;

import com.cl.etablissementservice.entities.Etablishment;
import com.cl.etablissementservice.enumerateurs.TypeEtablissement;
import com.cl.etablissementservice.services.EtablismentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class EtablissementServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EtablissementServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(EtablismentService etablismentService){
        return args -> {
          etablismentService.sauvegarderEtablishmentList(
                  List.of(
                          Etablishment.builder()
                                  .id(UUID.randomUUID().toString())
                                  .name("Etablissement de prestige")
                                  .address(" 27 Rue du General de Gaulle, 77144")
                                  .creationDate(LocalDate.now())
                                  .typeBuilding(TypeEtablissement.ETABLISSEMENT_HOTELIER)
                                  .build(),
                          Etablishment.builder()
                                  .id(UUID.randomUUID().toString())
                                  .name("Etablissement de meublee ")
                                  .address(" 27 Rue du General de Gaulle, 77168")
                                  .creationDate(LocalDate.now())
                                  .typeBuilding(TypeEtablissement.ETABLISSEMENT_MEUBLE)
                                  .build(),
                          Etablishment.builder()
                                  .id(UUID.randomUUID().toString())
                                  .name("Etablissement de Standard")
                                  .address(" 27 Rue du General de Gaulle, 77114")
                                  .creationDate(LocalDate.now())
                                  .typeBuilding(TypeEtablissement.ETABLISSEMENT_STANDARD)
                                  .build(),
                          Etablishment.builder()
                                  .id(UUID.randomUUID().toString())
                                  .name("Etablissement de protegé")
                                  .address(" 27 Rue du General de Gaulle, 77238")
                                  .creationDate(LocalDate.now())
                                  .typeBuilding(TypeEtablissement.ETABLISSEMENT_PROTECTED)
                                  .build()
                          )
          );
        };
    }
}
