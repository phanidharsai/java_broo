package com.phanidharsai.designpatterns.behavioral.strategy.improvement;

public class CreditCardPayment implements PaymentMethod {
  public void processPayment() {
    System.out.println("Processing credit card payment...");
  }
}