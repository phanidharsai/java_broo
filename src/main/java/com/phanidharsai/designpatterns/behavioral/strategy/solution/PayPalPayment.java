package com.phanidharsai.designpatterns.behavioral.strategy.solution;

public class PayPalPayment implements PaymentStrategy {
  public void processPayment() {
    System.out.println("Processing PayPal payment...");
  }
}