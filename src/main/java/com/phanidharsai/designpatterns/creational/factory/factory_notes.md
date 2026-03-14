Advantages of Using the Factory Design Pattern
Let’s review how the Factory Pattern improves our solution:

1. Centralized Object Creation:

The ModeFactory class handles all the logic of creating rides. Now, you only need to call the getInstance() method
with the desired input type, and the factory will take care of the rest. This makes the code much cleaner and easier to 
maintain.

2. Scalability:

If you want to add a new ride type, say truck, you only need to add the truck class and update the ModeFactory class. 
No changes are needed in the rest of the application.

3. Encapsulation:

The client code (in Main.java) no longer needs to know how to create the rides. The logic is abstracted away in the 
ModeFactory class, which makes the system easier to manage. 


Real-life Use Cases and Examples of the Factory Design Pattern
The Factory Design Pattern is widely used in real-world software development. Here are some examples:

• Database Connections:

When creating a connection to different types of databases (e.g., MySQL, PostgreSQL, Oracle), the factory can handle 
the creation of database connections based on configuration parameters without exposing the details to the client. 


• User Interface Elements:

In GUI libraries, different platforms (Windows, Mac, Linux) may require different implementations of buttons, 
windows, and menus. A factory pattern can be used to create the appropriate UI elements for the specific platform. 

• Logging:

Depending on the logging requirements (e.g., logging to a file, console, or database), a factory can create 
the correct type of logger, allowing different components of the system to use the logger without knowing its exact 
implementation. 

Conclusion
The Factory Design Pattern simplifies object creation by centralizing it in a factory, making the code cleaner, 
more maintainable, and easier to extend. It ensures that we can easily add new types or change the instantiation logic without
touching the client code. 
This pattern is highly beneficial when your application needs to create a variety of objects in a flexible and scalable way. 