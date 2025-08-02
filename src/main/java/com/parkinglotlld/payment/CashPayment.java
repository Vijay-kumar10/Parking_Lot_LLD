package com.parkinglotlld.payment;

public class CashPayment implements PaymentStrategy{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Cash payment of $"+amount);
    }
}
