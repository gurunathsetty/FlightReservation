package test;

import main.Flight;
import main.FlightsProAir;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;



public class TestFlight {

    List<Integer> flights = new ArrayList<Integer>();

    Flight flight = new Flight(2);

    @Test
    public void unSuccessfullyReserveSeats() throws Exception {
        assertThrows(Exception.class,()-> flight.reserveSeats(0));
    }

    @Test
    public void zeroSeatsBooked(){
        assertThrows(Exception.class,()-> flight.reserveSeats(0));
    }

    @Test
    public void addFlights(){
        FlightsProAir flightsProAir = new FlightsProAir();
        assertTrue(flightsProAir.addFlights(2));

    }

}
