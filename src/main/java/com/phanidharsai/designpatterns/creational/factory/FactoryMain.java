package com.phanidharsai.designpatterns.creational.factory;

import com.phanidharsai.designpatterns.creational.factory.ride.ModeFactory;
import com.phanidharsai.designpatterns.creational.factory.ride.ModeOfRide;

public class FactoryMain {
    public static void main(String[] args){
        ModeFactory mode = new ModeFactory();
        ModeOfRide res=mode.getInstance("2 wheels");
        res.ride();

    }
}
