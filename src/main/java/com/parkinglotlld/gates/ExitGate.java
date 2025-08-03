package com.parkinglotlld.gates;

import com.parkinglotlld.parkingLot.ParkingLot;
import com.parkinglotlld.parkingLot.ParkingSpot;
import com.parkinglotlld.payment.PaymentService;
import com.parkinglotlld.vechile.Vechile;

public class ExitGate {

    private ParkingLot parkingLot;

    private PaymentService paymentService;

    public ExitGate(ParkingLot parkingLot, PaymentService paymentService) {
        this.parkingLot = parkingLot;
        this.paymentService = paymentService;
    }
    public void processExit(int spotNumber, int hourStay){
        ParkingSpot spot = parkingLot.getSpotByNumber(spotNumber);
        if(spot == null || !spot.isOccupied()){
            System.out.println("ivailed or vacat seat");
            return;
        }
        //get the vechile on the spot
        Vechile vechile = spot.getVechile();
        if (vechile == null) {
            System.out.println("No vechile found on this spot");
            return;
        }
        double fee = vechile.calculateFee(hourStay);

        paymentService.processPayment(fee);

        //vacate the spot after payment
        parkingLot.vacateSpot(spot,vechile);
        System.out.println("spot vacated successfully");

    }
}
