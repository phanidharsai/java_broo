package com.phanidharsai.designpatterns.behavioral.strategy.solution;

public class StripePayment implements PaymentStrategy {
  public void processPayment() {
    System.out.println("Processing Stripe payment...");
  }
}