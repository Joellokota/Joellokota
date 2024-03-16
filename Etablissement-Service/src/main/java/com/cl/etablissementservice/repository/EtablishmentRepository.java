package com.cl.etablissementservice.repository;

import com.cl.etablissementservice.entities.Etablishment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtablishmentRepository extends JpaRepository<Etablishment, String> {

}
