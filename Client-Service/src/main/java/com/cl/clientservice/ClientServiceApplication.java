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
                            .siren(UUID.randomUUID().toString())
                            .siret(UUID.randomUUID().toString() + "-SIRET")
                            .legalOwner("User1")
                            .legalManager("User1")
                            .dateCreation(LocalDate.now())
                            .typeCustomer(TypeCustomer.ETABLISSEMENT_HOTELIER)
                            .build(),
                    Customer.builder()
                            .siren(UUID.randomUUID().toString())
                            .siret(UUID.randomUUID().toString() + "-SIRET")
                            .legalOwner("User2")
                            .legalManager("User2")
                            .dateCreation(LocalDate.now())
                            .typeCustomer(TypeCustomer.ETABLISSEMENT_PROTECTED)
                            .build(),
                    Customer.builder()
                            .siren(UUID.randomUUID().toString())
                            .siret(UUID.randomUUID().toString() + "-SIRET")
                            .legalOwner("User3")
                            .legalManager("User3")
                            .dateCreation(LocalDate.now())
                            .typeCustomer(TypeCustomer.ETABLISSEMENT_MEUBLE)
                            .build(),
                    Customer.builder()
                            .siren(UUID.randomUUID().toString())
                            .siret(UUID.randomUUID().toString() + "-SIRET")
                            .legalOwner("User4")
                            .legalManager("User4")
                            .dateCreation(LocalDate.now())
                            .typeCustomer(TypeCustomer.ETABLISSEMENT_STANDARD)
                            .build()
            ));
        };
    }
}
