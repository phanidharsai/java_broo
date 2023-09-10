package com.phanidharsai.designpatterns.structural.composite;

public class Main {
    public static void main(String[] args){
        Component monitor= new Leaf("monitor",15000.0);
        Component mouse = new Leaf("mouse",3000.0);
        Component keyboard = new Leaf("keyboard",3000.0);
        Component ram = new Leaf("ram",20000.0);
        Component cpu= new Leaf("cpu",30000.0);

        Composite ph= new Composite("peripherals");
        Composite cabinet = new Composite("cabinet");

        Composite computer = new Composite("Computer");

        ph.addComponent(monitor);
        ph.addComponent(mouse);
        ph.addComponent(keyboard);

        cabinet.addComponent(ram);
        cabinet.addComponent(cpu);

        computer.addComponent(ph);
        computer.addComponent(cabinet);

        computer.showPrice();
        ph.showPrice();
        mouse.showPrice();





    }
}
