package com.phanidharsai.designpatterns.creational.factory;

public class Car implements ModeOfRide {
    @Override
    public void ride() {
        System.out.println("I am driving a car");
    }
}
