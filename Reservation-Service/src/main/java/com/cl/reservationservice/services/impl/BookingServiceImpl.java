package com.cl.reservationservice.services.impl;

import com.cl.reservationservice.entities.Booking;
import com.cl.reservationservice.repository.BookingRepository;
import com.cl.reservationservice.services.BookingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    private BookingRepository bookingRepository;

    public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public List<Booking> obtenirListDeBookings() {
        return this.bookingRepository.findAll();
    }

    @Override
    public Booking obtenirUnBooking(Long id) {
        return this.bookingRepository.findById(id).get();
    }

    @Override
    public List<Booking> sauvegarderBooking(List<Booking> bookingList) {
        return this.bookingRepository.saveAll(bookingList);
    }
}
