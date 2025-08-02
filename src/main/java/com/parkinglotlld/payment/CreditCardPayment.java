package com.parkinglotlld.payment;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit-card payment of $"+amount);
    }
}
