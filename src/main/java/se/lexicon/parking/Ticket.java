package se.lexicon.parking;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Ticket {
    private ParkingSpot parkingSpot;
    private Car car;
    private LocalDateTime arrivalTime;
    private LocalDateTime departureTime;

    public Ticket(ParkingSpot parkingSpot, Car car) {
        this.parkingSpot = parkingSpot;
        this.car = car;
    }

    public long calculateParkingTime() {
        return arrivalTime.until(departureTime, ChronoUnit.MINUTES);
    }
}
