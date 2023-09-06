package com.phanidharsai.designpatterns.structural.adaptor.main;

public class CarClub {
    public static void main(String[] args){
        RoadTrip rT = new RoadTrip();
        Car car= new CarMapper();
        rT.setC(car);
        car.ride("I am on a RoadTrip");
    }
}
