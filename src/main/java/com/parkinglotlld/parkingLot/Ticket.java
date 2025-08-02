package com.parkinglotlld.parkingLot;



import com.parkinglotlld.vechile.Vechile;

import java.time.LocalDateTime;

public class Ticket {

    private ParkingSpot parkingSpot;

    private Vechile vechile;

    private LocalDateTime time;

    public Ticket(ParkingSpot parkingspot, Vechile vechile){
        this.parkingSpot = parkingspot;
        this.vechile = vechile;
    }
    public void parkVechile(Vechile vechile){

    }
}
