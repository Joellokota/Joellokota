package com.cl.reservationservice.services;

import com.cl.reservationservice.entities.Booking;

import java.util.List;

public interface BookingService {
    List<Booking> obtenirListDeBookings();

    Booking obtenirUnBooking(Long id);

    List<Booking> sauvegarderBooking(List<Booking> bookingList);
}
