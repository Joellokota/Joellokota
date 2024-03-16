package com.cl.reservationservice.repository;

import com.cl.reservationservice.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
