package com.phanidharsai.designpatterns.structural.composite;

public class Main {
    public static void main(String[] args){
        Component monitor= new Leaf("monitor",15000.0);
        Component mouse = new Leaf("mouse",3000.0);
        Component keyboard = new Leaf("keyboard",3000.0);
        Component ram = new Leaf("ram",20000.0);
        Component cpu= new Leaf("cpu",30000.0);

        Composite ph= new Composite("peripherals");
        Component cabinet = new Composite("cabinet");

    }
}
