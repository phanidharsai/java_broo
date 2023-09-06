package com.phanidharsai.designpatterns.creational.factory.ride;

import com.phanidharsai.designpatterns.creational.factory.ride.ModeOfRide;

public class Car implements ModeOfRide {
    @Override
    public void ride() {
        System.out.println("I am driving a car");
    }
}
