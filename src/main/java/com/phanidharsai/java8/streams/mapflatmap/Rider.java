package com.phanidharsai.java8.streams.mapflatmap;

import java.util.List;

public class Rider {
    String riderName;
    String bikeName;
    String company;
    Double price;
    Double kmDriven;
    List<String> countrysVisited;

    public Rider() {
    }

    public Rider(String riderName, String bikeName, String company, Double price, Double kmDriven, List<String> countrysVisited) {
        this.riderName = riderName;
        this.bikeName = bikeName;
        this.company = company;
        this.price = price;
        this.kmDriven = kmDriven;
        this.countrysVisited = countrysVisited;
    }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    public void setcompany(String company) {
        this.company = company;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setkmDriven(double kmDriven) {
        this.kmDriven = kmDriven;
    }

    public void setCountrysVisited(List<String> countrysVisited) {
        this.countrysVisited = countrysVisited;
    }

    public String getRiderName() {
        return riderName;
    }

    public String getBikeName() {
        return bikeName;
    }

    public String getcompany() {
        return company;
    }

    public Double getPrice() {
        return price;
    }

    public double getkmDriven() {
        return kmDriven;
    }

    public List<String> getCountrysVisited() {
        return countrysVisited;
    }

    @Override
    public String toString() {
        return "Rider{" +
                "riderName='" + riderName + '\'' +
                ", bikeName='" + bikeName + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                ", kmDriven=" + kmDriven +
                ", countrysVisited=" + countrysVisited +
                '}';
    }
}

