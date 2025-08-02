package com.parkinglotlld.payment;

public interface PaymentStrategy {
    void processPayment(double amount);
}
