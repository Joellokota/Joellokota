package com.cl.etablissementservice.services;

import com.cl.etablissementservice.entities.Etablishment;

import java.util.List;

public interface EtablismentService {
    List<Etablishment> retourneLiistEtablishments();

    Etablishment obtenirEtablishment(String id);

    List<Etablishment> sauvegarderEtablishmentList(List<Etablishment> build);
}
