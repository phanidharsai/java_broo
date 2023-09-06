package com.phanidharsai.designpatterns.structural.adaptor.main;

public class RoadTrip {
    private Car c;
    public Car getC(){
        return c;
    }
    public void setC(Car c){
        this.c=c;
    }
    public void startTrip(String status){
        c.ride(status);
    }
}
