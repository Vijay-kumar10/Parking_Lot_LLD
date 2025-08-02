package com.parkinglotlld.parkingLot;

import com.parkinglotlld.vechile.Vechile;

public class CarParkingSpot extends ParkingSpot {

    public CarParkingSpot(int spotNumber) {
        super(spotNumber,"Car");
    }
    @Override
    public boolean canParkVechile(Vechile vechile) {
        return "Car".equalsIgnoreCase(vechile.getVechileType());
    }
}
