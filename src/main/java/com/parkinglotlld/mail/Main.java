package com.parkinglotlld.mail;

import com.parkinglotlld.gates.EntranceGate;
import com.parkinglotlld.gates.ExitGate;
import com.parkinglotlld.parkingLot.ParkingFloor;
import com.parkinglotlld.parkingLot.ParkingLot;
import com.parkinglotlld.payment.PaymentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ParkingFloor floor1 = new ParkingFloor(1,2,2);
        ParkingFloor floor2 = new ParkingFloor(2,2,2);
        List<ParkingFloor> flors = new ArrayList<ParkingFloor>();
        flors.add(floor1);
        flors.add(floor2);
        ParkingLot parkingLot = new ParkingLot(flors);

        //Initilize the Payment service
        PaymentService paymentService = new PaymentService(scanner);

        //Initilize  gates, passing both parkingLots and paymentService to Exitgate
        EntranceGate entranceGate = new EntranceGate(parkingLot);
        ExitGate exitGate = new ExitGate(parkingLot,paymentService);


        //start the parking lot System
        System.out.println("\n=====================================");
        System.out.println("Welcome to the parking Lot system");
        System.out.println("=====================================");

        //continous parking system until user cannot exit
        boolean exit = false;
        while (!exit) {
            //display menu
            showMenu();
            int choice =  getUserChoice(scanner);
            switch (choice) {
                case 1:
                    parkVechile(entranceGate);
                    break;
                case 2:
                    vacatSpot(exitGate,scanner);
                    break;
                case 3:
                    exit=true;
                    System.out.println("Thanks to using the parking Lot.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;

            }

        }



    }

    private static void showMenu(){
        System.out.println("\n********************************************************");
        System.out.println("Please choose one of the following options:");
        System.out.println("1. Park the vechile");
        System.out.println("2. Vacate the vechile spot");
        System.out.println("3. Exit");
        System.out.println("********************************************************");
        System.out.print("Please choose one of the following options : ");
    }
    private static int getUserChoice(Scanner scanner){return scanner.nextInt();}

    private static void parkVechile(EntranceGate entranceGate){
        entranceGate.processEntrance();
    }
    private static void vacatSpot(ExitGate exitGate,Scanner scanner){
        System.out.print("Enter the spot number to vacate : ");
        int spotNumber = scanner.nextInt();
        System.out.print("Enter the no of hours the vechile stay : ");
        int hourStayed =  scanner.nextInt();
        exitGate.processExit(spotNumber,hourStayed);

    }
}
