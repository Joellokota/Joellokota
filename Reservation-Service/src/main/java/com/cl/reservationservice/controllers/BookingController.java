package com.cl.reservationservice.controllers;

import com.cl.reservationservice.entities.Booking;
import com.cl.reservationservice.services.BookingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class BookingController {

    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping("/bookings")
    public List<Booking> bookingList(){
        return this.bookingService.obtenirListDeBookings();
    }

    @GetMapping("/bookings/{id}")
    public Booking toGetBooking(@PathVariable Long id){
        return this.bookingService.obtenirUnBooking(id);
    }
}
