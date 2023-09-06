package com.phanidharsai.designpatterns.creational.factory.ride;

public class ModeFactory {
    public ModeOfRide getInstance(String input){
        if(input.equals("2 wheels")){
            return new Bike();
        }
        else if(input.equals("4 wheels")){
            return new Car();
        }
        else{
            return new Plane();
        }
    }
}
