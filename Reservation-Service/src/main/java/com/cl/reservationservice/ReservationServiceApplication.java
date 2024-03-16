package com.cl.reservationservice;

import com.cl.reservationservice.entities.Booking;
import com.cl.reservationservice.services.BookingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.awt.print.Book;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class ReservationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservationServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(BookingService bookingService){
		return args -> {
			bookingService.sauvegarderBooking(
					List.of(
							Booking.builder()
									.bookingClientEmail("joellokota@gmail.com")
									.bookingNumber(UUID.randomUUID().toString())
									.dateCheckin(LocalDate.now())
									.dateCheckout(LocalDate.now().plusDays(Long.valueOf(2)))
									.numberPersons(2)
									.price(210.00)
									.bookingClientName("Joel LOKOTA")
									.build(),
							Booking.builder()
									.bookingClientEmail("joellokota4@gmail.com")
									.bookingNumber(UUID.randomUUID().toString())
									.dateCheckin(LocalDate.now())
									.dateCheckout(LocalDate.now().plusDays(Long.valueOf(7)))
									.numberPersons(6)
									.price(1010.00)
									.bookingClientName("Joel ALEXANDRA")
									.build(),
							Booking.builder()
									.bookingClientEmail("joellokota3@gmail.com")
									.bookingNumber(UUID.randomUUID().toString())
									.dateCheckin(LocalDate.now())
									.dateCheckout(LocalDate.now().plusDays(Long.valueOf(5)))
									.numberPersons(8)
									.price(910.00)
									.bookingClientName("Joel ANDREA")
									.build(),
							Booking.builder()
									.bookingClientEmail("joellokota2@gmail.com")
									.bookingNumber(UUID.randomUUID().toString())
									.dateCheckin(LocalDate.now())
									.dateCheckout(LocalDate.now().plusDays(Long.valueOf(6)))
									.numberPersons(4)
									.price(810.00)
									.bookingClientName("Joel YULA")
									.build(),
							Booking.builder()
									.bookingClientEmail("joellokota1@gmail.com")
									.bookingNumber(UUID.randomUUID().toString())
									.dateCheckin(LocalDate.now())
									.dateCheckout(LocalDate.now().plusDays(Long.valueOf(4)))
									.numberPersons(4)
									.price(310.00)
									.bookingClientName("Joel OMOMBO")
									.build()
					)
			);
		};
	}
}
