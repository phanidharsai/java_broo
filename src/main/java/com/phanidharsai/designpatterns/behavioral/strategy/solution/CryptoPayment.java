package com.phanidharsai.designpatterns.behavioral.strategy.solution;

public class CryptoPayment implements PaymentStrategy {
  public void processPayment() {
    System.out.println("Processing crypto payment...");
  }
}