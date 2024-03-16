package com.cl.reservationservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder @ToString
public class Booking {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bookingNumber;
    private String buildingNumber;
    private String bookingClientName;
    private String bookingClientEmail;
    private LocalDate dateCheckin;
    private LocalDate dateCheckout;
    private int numberPersons;
    private double price;
}
