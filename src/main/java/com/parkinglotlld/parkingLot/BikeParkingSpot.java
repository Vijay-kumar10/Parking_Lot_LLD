package com.parkinglotlld.parkingLot;

import com.parkinglotlld.vechile.Vechile;

public class BikeParkingSpot extends ParkingSpot {

    public BikeParkingSpot(int spotNumber) {
        super(spotNumber,"Bike");
    }

    @Override
    public boolean canParkVechile(Vechile vechile) {
        return "Bike".equalsIgnoreCase(vechile.getVechileType());
    }
}
