package com.phanidharsai.designpatterns.creational.singleton.solution;

public class Application {
  public void run() {
    Logger logger = Logger.getInstance(); // Always fetch the same instance
    logger.log("Application started.");
  }
}