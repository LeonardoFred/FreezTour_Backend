package com.digitazon.economicaircompany;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.digitazon.economicaircompany.model.Airport;
import com.digitazon.economicaircompany.model.Booking;
import com.digitazon.economicaircompany.model.Flight;
import com.digitazon.economicaircompany.service.AirportService;
import com.digitazon.economicaircompany.service.BookingService;
import com.digitazon.economicaircompany.service.FlightService;



@Component
public class DataLoadRunner implements CommandLineRunner {

    /* Utilizzo i service! Non i repository */
    

    @Autowired
    FlightService flightService;

    @Autowired
    BookingService bookingService;

    @Autowired
    AirportService airportService;

    @Override
    public void run(String... args) throws Exception {

        /** Dati di test da inserire nel database */
        
        Airport leonardoDaVinci = new Airport("Leonardo da Vinci", "Fiumicino", "Italy", "0001");

        Airport linate = new Airport("Linate", "Milano", "Italy", "0002");

        airportService.createAirport(leonardoDaVinci);
        airportService.createAirport(linate);

        Flight f1 = new Flight(LocalDateTime.of(2022, 12, 20, 11, 31),
                LocalDateTime.of(2022, 12, 20, 12, 31),
                leonardoDaVinci,
                linate);

        Flight f2 = new Flight(LocalDateTime.of(2022, 12, 21, 12, 30),
                LocalDateTime.of(2022, 12, 21, 14, 30),
                linate,
                leonardoDaVinci);

        flightService.createFlight(f1);
        flightService.createFlight(f2);
        
    
        //public Booking(String code, String seatNumber, String description, Double ticketPrice, Flight flight) 
        Booking b1 = new Booking("P001", "A01", "Posto finestrino", 9.99, f1); 
        Booking b2 = new Booking("P002", "G27", "Posto corridoio", 5.99, f1); 
        Booking b3 = new Booking("P003", "Z02", "Posto corridoio", 2.99, f1); 
        Booking b4 = new Booking("P004", "B31", "Posto in coda", 0.99, f2); 

        bookingService.createBooking(b1); 
        bookingService.createBooking(b2); 
        bookingService.createBooking(b3); 
        bookingService.createBooking(b4); 

        /* Scrivere codice per testare anche DELETE, UPDATE e GET */

    }}

    


