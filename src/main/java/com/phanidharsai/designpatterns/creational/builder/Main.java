package com.phanidharsai.designpatterns.creational.builder;

public class Main {
    public static void main(String[] args){
        // if we do not use bike builder we have to provide each and every value for the object to be created
        // else we will syntax error
        Bike bikeWithoutBuilder = new Bike("BMW","Naked",600,30.0);
        // using builder class we can create object any of the chosen attributes and rest will have default values
        Bike bikeWithBuilder = new BikeBuilder().setMake("DUCATI").getbike();
    }
}
