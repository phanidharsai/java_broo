package com.phanidharsai.designpatterns.behavioral.strategy.improvement;

public class StripePayment implements PaymentMethod {
  public void processPayment() {
    System.out.println("Processing Stripe payment...");
  }
}