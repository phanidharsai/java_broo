package com.phanidharsai.designpatterns.creational.builder;

public class BikeBuilder {
    private String make;
    private String type;
    private Integer engineCc;
    private double mileage;

    public BikeBuilder setMake(String make) {
        this.make = make;
        return this;
    }

    public BikeBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public BikeBuilder setEngineCc(Integer engineCc) {
        this.engineCc = engineCc;
        return this;
    }

    public BikeBuilder setMileage(double mileage) {
        this.mileage = mileage;
        return this;
    }
    public Bike getbike(){
        return new Bike(make,type,engineCc,mileage);
    }
}
