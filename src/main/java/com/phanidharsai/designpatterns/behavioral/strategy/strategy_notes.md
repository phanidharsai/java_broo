**Introduction to the Strategy Pattern** 

In simple terms, the Strategy Pattern allows you to define a family of algorithms or behaviors, and choose 
the one to use during runtime. It is like having a toolbox  where you can pick the best tool (or strategy) 
for the task at hand. This approach avoids hardcoding multiple behaviors into one class and promotes flexibility 
by separating the behavior logic into different classes.

Real-Life Scenario: Payment Processing in E-commerce 
Imagine you're developing an e-commerce platform where users can make purchases using various payment methods 
like Credit Cards, PayPal, or Cryptocurrency. Each payment method has its own unique processing logic.

Without the Strategy Pattern, you'd likely have a large, monolithic class with many if-else or switch statements,
checking for the payment method and executing the specific logic for each one. But what happens when you need to 
add another payment method (like Apple Pay or Stripe)? It becomes a nightmare to manage and extend. 😱

Advantages of the Strategy Pattern
1. Flexibility:
We can switch between different payment strategies at runtime without modifying the PaymentProcessor class.

2. Maintainability:
New payment methods can be added by simply creating new strategy classes. We don't need to touch the existing code. ️

3. Separation of Concerns:
Each payment method has its own class, making the code easier to understand and maintain.

4. Extensibility:
As new payment methods become available, we can simply add them by creating new strategy classes.

Real-Life Use Cases for the Strategy Pattern
• Payment Methods :
Process payments via different methods like Credit Card, PayPal, Crypto, etc.

• Sorting Algorithms :
Use different sorting strategies (e.g., quick sort, merge sort) depending on the situation.

• Shipping Costs :
Calculate shipping costs based on various factors such as location, delivery speed, and package size.