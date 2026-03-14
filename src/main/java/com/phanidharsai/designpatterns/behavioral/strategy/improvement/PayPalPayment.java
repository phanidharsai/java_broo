package com.phanidharsai.designpatterns.behavioral.strategy.improvement;

public class PayPalPayment implements PaymentMethod {
  public void processPayment() {
    System.out.println("Processing PayPal payment...");
  }
}