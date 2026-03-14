package com.phanidharsai.designpatterns.creational.singleton.problem;

public class Application {
    public void run() {
        Logger logger = new Logger();  // New instance created every time
        logger.log("Application started.");
    }
}