package com.parkinglotlld.payment;

public class UpiPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Upi payment of $"+amount);
    }
}
