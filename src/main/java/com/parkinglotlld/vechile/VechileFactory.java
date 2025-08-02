package com.parkinglotlld.vechile;

public class VechileFactory {
    public static Vechile createVechile(String licencePlate,String vechileType){

        if(vechileType.equalsIgnoreCase("Car")){
        return new CarVechile(licencePlate);
        } else if (vechileType.equalsIgnoreCase("Bike")) {
            return new BikeVechile(licencePlate);
        }
        return null;
    }
}
