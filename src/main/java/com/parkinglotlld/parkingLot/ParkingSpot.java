package com.parkinglotlld.parkingLot;

import com.parkinglotlld.vechile.Vechile;

public abstract class ParkingSpot {
    private int spotNumber;
    private boolean isOccupied;
    private Vechile vechile;
    private String spotType;

    public ParkingSpot(int spotNumber, String spotType) {
        this.spotNumber = spotNumber;
        this.isOccupied = false;
        this.spotType = spotType;
    }

    public boolean isOccupied() {return isOccupied;}

    public abstract boolean canParkVechile(Vechile vechile);

    public void parkVechile(Vechile vechile) {
        if (isOccupied) {
            throw new IllegalStateException("This parking spot is occupied");
        }if(!canParkVechile(vechile)) {
            throw new IllegalStateException("This parking spot is not suitable for a "+vechile.getVechileType());
        }
        this.vechile = vechile;
        isOccupied = true;
    }
    public void vacate(Vechile vechile) {
        if (!isOccupied) {
            throw new IllegalStateException("Spot is already vacant");
        }
        this.vechile = null;
        isOccupied = false;
    }
    public int getSpotNumber() {return spotNumber;}
    public String getSpotType() {return spotType;}
    public Vechile getVechile() {return vechile;}

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "spotNumber=" + spotNumber +
                ", isOccupied=" + isOccupied +
                ", vechile=" + vechile +
                ", spotType='" + spotType + '\'' +
                '}';
    }
}
