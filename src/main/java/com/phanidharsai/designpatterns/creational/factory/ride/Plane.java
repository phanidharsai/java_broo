package com.phanidharsai.designpatterns.creational.factory.ride;

public class Plane implements  ModeOfRide{
    @Override
    public void ride() {
        System.out.println("I am flying a plane");
    }
}
