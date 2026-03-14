package com.phanidharsai.designpatterns.creational.factory;

public class FactoryMain {
    public static void main(String[] args){
        ModeFactory mode = new ModeFactory();
        ModeOfRide res=mode.getInstance("2 wheels");
        res.ride();

    }
}
