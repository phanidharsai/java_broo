package com.phanidharsai.designpatterns.structural.composite;

public class Leaf implements Component{
    public String name;
    public double price;

    public Leaf(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showPrice() {
        System.out.println(name+" : "+price);
    }
}
