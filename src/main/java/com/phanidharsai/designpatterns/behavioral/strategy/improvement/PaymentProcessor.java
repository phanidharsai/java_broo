/*  Why Is This Still a Problem? 🔴
1. Adding New Payment Methods:
Every time a new payment method is added, you need to go into the PaymentProcessor class and add a
new else if block. This results in code duplication and poor maintainability.
2. Scalability Issues:
As the number of payment methods increases (imagine 20+ methods), the PaymentProcessor class will become massive,
making it hard to read and hard to modify.
* */

package com.phanidharsai.designpatterns.behavioral.strategy.improvement;

public class PaymentProcessor {
  // This method processes payment based on the payment method type
  public void processPayment(String paymentMethod) {
    if (paymentMethod.equals("CreditCard")) {
      CreditCardPayment creditCard = new CreditCardPayment();
      creditCard.processPayment(); // Process Credit Card payment
    } else if (paymentMethod.equals("PayPal")) {
      PayPalPayment payPal = new PayPalPayment();
      payPal.processPayment(); // Process PayPal payment
    } else if (paymentMethod.equals("Crypto")) {
      CryptoPayment crypto = new CryptoPayment();
      crypto.processPayment(); // Process Crypto payment
    } else if (paymentMethod.equals("Stripe")) {
      StripePayment stripe = new StripePayment();
      stripe.processPayment(); // Process Stripe payment
    }
//    else if (paymentMethod.equals("ApplePay")) { // New payment method added
//      ApplePayPayment applePay = new ApplePayPayment();
//      applePay.processPayment(); // Process Apple Pay payment
//    }
    else {
      System.out.println("Payment method not supported.");
    }
  }
}