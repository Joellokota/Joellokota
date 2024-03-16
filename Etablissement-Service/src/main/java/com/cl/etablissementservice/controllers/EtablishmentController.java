package com.cl.etablissementservice.controllers;

import com.cl.etablissementservice.entities.Etablishment;
import com.cl.etablissementservice.services.EtablismentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class EtablishmentController {

    private EtablismentService etablismentService;

    public EtablishmentController(EtablismentService etablismentService) {
        this.etablismentService = etablismentService;
    }

    @GetMapping("/etablishments")
    public List<Etablishment> etablishmentList(){
        return this.etablismentService.retourneLiistEtablishments();
    }

    @GetMapping("/etablishments/{id}")
    public Etablishment toGetEtablishment(@PathVariable String id){
        return this.etablismentService.obtenirEtablishment(id);
    }
}
