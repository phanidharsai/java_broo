/*
What’s Wrong with This?
Here’s where the problem comes in:
• Adding new payment methods: Every time you want to add a new payment method, you have to go into the processPayment() method
 and modify the code.
• Code duplication: We keep repeating similar blocks of code for each payment method, which can get messy when we add
more and more methods.
• Scalability issues: As you keep adding new methods (Stripe, Google Pay, Apple Pay, etc.), this if-else block becomes harder
to maintain and less flexible. Imagine what happens when you have 20 payment methods. The code gets huge and difficult to read.
* */

package com.phanidharsai.designpatterns.behavioral.strategy.problem;

public class PaymentProcessor {
  // This method will process payment based on payment method type
  public void processPayment(String paymentMethod) {
    if (paymentMethod.equals("CreditCard")) {
      // Process Credit Card payment
      System.out.println("Processing credit card payment...");
    } else if (paymentMethod.equals("PayPal")) {
      // Process PayPal payment
      System.out.println("Processing PayPal payment...");
    } else if (paymentMethod.equals("Crypto")) {
      // Process Crypto payment
      System.out.println("Processing crypto payment...");
    } else {
      // If an unsupported payment method is entered
      System.out.println("Payment method not supported.");
    }
  }
}

/*
 *  Step 2: Slight Improvement Using Interfaces
 * PaymentMethod Interface
 * Instead of hardcoding the payment methods inside the PaymentProcessor class, we can define an interface
 * PaymentMethod with a method processPayment(). All payment methods will implement this interface and provide
 * their own implementation of processPayment().
 */
