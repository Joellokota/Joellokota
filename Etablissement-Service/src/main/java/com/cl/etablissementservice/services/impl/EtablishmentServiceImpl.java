package com.cl.etablissementservice.services.impl;

import com.cl.etablissementservice.entities.Etablishment;
import com.cl.etablissementservice.repository.EtablishmentRepository;
import com.cl.etablissementservice.services.EtablismentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtablishmentServiceImpl implements EtablismentService {

    private EtablishmentRepository etablishmentRepository;

    public EtablishmentServiceImpl(EtablishmentRepository etablishmentRepository) {
        this.etablishmentRepository = etablishmentRepository;
    }


    @Override
    public List<Etablishment> retourneLiistEtablishments() {
        return this.etablishmentRepository.findAll();
    }

    @Override
    public Etablishment obtenirEtablishment(String id) {
        return this.etablishmentRepository.findById(id).get();
    }

    @Override
    public List<Etablishment> sauvegarderEtablishmentList(List<Etablishment> etablishments) {
        return this.etablishmentRepository.saveAll(etablishments);
    }
}
