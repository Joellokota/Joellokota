package com.cl.clientservice;

import com.cl.clientservice.entities.Customer;
import com.cl.clientservice.enumerateurs.TypeCustomer;
import com.cl.clientservice.services.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;


@SpringBootApplication
@CrossOrigin("*")
public class ClientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(CustomerService customerService){
        return args -> {
            customerService.toutSauvegarder(List.of(
                    Customer.builder()
                            .siren(UUID.randomUUID().toString().substring(0, 5))
                            .siret("USER1-SIRET")
                            .legalOwner("Joel Edmond")
                            .legalManager("Joel Edmond")
                            .dateCreation(LocalDate.now())
                            .typeCustomer(TypeCustomer.ETABLISSEMENT_HOTELIER)
                            .build(),
                    Customer.builder()
                            .siren(UUID.randomUUID().toString().substring(0, 5))
                            .siret("USER2-SIRET")
                            .legalOwner("Alexandra MAMISALA")
                            .legalManager("Alexandra MAMISALA")
                            .dateCreation(LocalDate.now())
                            .typeCustomer(TypeCustomer.ETABLISSEMENT_PROTECTED)
                            .build(),
                    Customer.builder()
                            .siren(UUID.randomUUID().toString().substring(0, 5))
                            .siret("USER3-SIRET")
                            .legalOwner("Nathalie TCHOUZZ")
                            .legalManager("Nathalie TCHOUZZ")
                            .dateCreation(LocalDate.now())
                            .typeCustomer(TypeCustomer.ETABLISSEMENT_MEUBLE)
                            .build(),
                    Customer.builder()
                            .siren(UUID.randomUUID().toString().substring(0, 5))
                            .siret("USER4-SIRET")
                            .legalOwner("Andrea JEANNE")
                            .legalManager("Andrea JEANNE")
                            .dateCreation(LocalDate.now())
                            .typeCustomer(TypeCustomer.ETABLISSEMENT_STANDARD)
                            .build()
            ));
        };
    }
}
