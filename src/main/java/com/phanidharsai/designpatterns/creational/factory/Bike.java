package com.phanidharsai.designpatterns.creational.factory;

public class Bike implements ModeOfRide{
    @Override
    public void ride() {
        System.out.println("I am driving a bike");
    }
}
