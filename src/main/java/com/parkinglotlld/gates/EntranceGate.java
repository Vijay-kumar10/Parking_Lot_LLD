package com.parkinglotlld.gates;

import com.parkinglotlld.parkingLot.ParkingLot;
import com.parkinglotlld.parkingLot.ParkingSpot;
import com.parkinglotlld.vechile.Vechile;
import com.parkinglotlld.vechile.VechileFactory;

import java.util.Scanner;

public class EntranceGate {

    private ParkingLot parkingLot;

    public EntranceGate(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }
    public void processEntrance(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the vechile licence plate number : ");
            String licenceplate = scanner.nextLine();
            System.out.println("Enter the vechileType(Car or Bike) : ");
            String vechileType = scanner.nextLine();
        Vechile vechile = VechileFactory.createVechile(licenceplate, vechileType);
        if (vechile == null) {
            System.out.println("Invalid vechile type only car and bike allowed");
            return;
        }
        //try to park vechile
            ParkingSpot spot = parkingLot.parkVechile(vechile);
        if(spot!=null){
            System.out.println("Vechile parked successfully on spot : " + spot);
        }else {
            System.out.println("No availabe spot of this vechile types");
             }
    }


}
