package com.parkinglotlld.parkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    private List<ParkingSpot> spots;    //list of parking spots in this floor

    private int floorNumber;

    //constructor
    ParkingFloor(int floorNumber, int numberOfCarSpots ,int numberOfBikeSpots ) {
            this.floorNumber = floorNumber;
            this.spots = new ArrayList<>();
    //add Spots for car
    for(int i=0; i<numberOfCarSpots; i++) {
        this.spots.add(new CarParkingSpot(i+1));
    }

    //add spots for Bike
        for (int i=numberOfCarSpots; i<numberOfBikeSpots+numberOfCarSpots; i++) {
            this.spots.add(new BikeParkingSpot(i+1));
        }
    }

    //method to find the availabe spot based on vechile type
    public ParkingSpot findAvailableSpot(String vechileType) {
        for (ParkingSpot spot : spots) {
            if(!spot.isOccupied() && spot.getSpotType().equalsIgnoreCase(vechileType)) {
                return spot;
            }
        }
        return null;
    }

    //Method to return all parking spots on this floor
    public List<ParkingSpot> getParkingSpots() {return spots;}


}
