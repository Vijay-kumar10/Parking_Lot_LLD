package com.parkinglotlld.vechile;

public class BikeVechile extends Vechile{
    private static double RATE=5.0;

    //Constructor
    public BikeVechile(String licencePlate) {
        super(licencePlate,"Bike");
    }

    @Override
    public double calculateFee(int hourStayed) {
        return 0;
    }
}
