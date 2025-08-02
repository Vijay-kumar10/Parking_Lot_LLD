package com.parkinglotlld.vechile;

public class CarVechile extends Vechile {
    private static final double RATE=10.0;

    //constructor
    public CarVechile(String licencePlate){
        super(licencePlate,"Car");
    }

    @Override
    public double calculateFee(int hourStayed) {
        return hourStayed*RATE;
    }

}
