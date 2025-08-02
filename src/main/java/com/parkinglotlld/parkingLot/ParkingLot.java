package com.parkinglotlld.parkingLot;

import com.parkinglotlld.vechile.Vechile;

import java.sql.SQLOutput;
import java.util.List;

public class ParkingLot {
    private List<ParkingFloor> floors;

    //constructor
    public ParkingLot(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    //Method to find available spot on all floors based on vechile type
    public ParkingSpot findAvailableSpot(String vechileType ) {
    for (ParkingFloor floor : floors) {
        ParkingSpot spot = floor.findAvailableSpot(vechileType);
        if (spot != null) {
            return spot; //FIND AN AVAILABLE SPOT FOR VECHILE
        }
    }
        return null; //THERE IS NO ANY SPOT AVAILABLE
    }

    //method to park a vechile
    public ParkingSpot parkVechile(Vechile vechile){
        ParkingSpot spot = findAvailableSpot(vechile.getVechileType());
        if (spot != null) {
            spot.parkVechile(vechile);
            System.out.println("Vechile parked Successfully in spot : "+spot.getSpotNumber());
            return spot;
        }
        System.out.println("No parking spot avialabe for "+vechile.getVechileType());
        return null;
    }

    //Method to vacate a parking spot
    public void vacateSpot(ParkingSpot spot,Vechile vechile){
        if(spot!=null && spot.isOccupied() && spot.getVechile().equals(vechile)){
            spot.vacate(vechile);
            System.out.println(vechile.getVechileType()+" Vacate the spot : "+spot.getSpotNumber());
        }else {
            System.out.println("Invailed Operation! either the spot is already vacant or the vechile type does not match");
        }
    }

    //method to find the spot with the spot number
    public ParkingSpot getSpotByNumber(int spotNumber){
        for (ParkingFloor floor : floors) {
            for(ParkingSpot spot : floor.getParkingSpots()){
                if(spot.getSpotNumber() == spotNumber){
                    return spot;
                }
            }
        }
        return null;
    }

    //getter for floors
    public List<ParkingFloor> getFloors() {return floors; }


}
