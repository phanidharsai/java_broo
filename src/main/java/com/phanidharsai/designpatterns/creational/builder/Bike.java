package com.phanidharsai.designpatterns.creational.builder;

public class Bike {
    private String make;
    private String type;
    private Integer engineCc;
    private double mileage;
    public Bike(String make, String type, Integer engineCc, double mileage) {
        this.make = make;
        this.type = type;
        this.engineCc = engineCc;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "make='" + make + '\'' +
                ", type='" + type + '\'' +
                ", engineCc='" + engineCc + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
