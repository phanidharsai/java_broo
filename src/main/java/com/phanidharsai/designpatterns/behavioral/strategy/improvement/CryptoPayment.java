package com.phanidharsai.designpatterns.behavioral.strategy.improvement;

public class CryptoPayment implements PaymentMethod {
  public void processPayment() {
    System.out.println("Processing crypto payment...");
  }
}