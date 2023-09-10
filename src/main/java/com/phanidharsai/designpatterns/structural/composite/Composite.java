package com.phanidharsai.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    public String name;
    public List<Component> com = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }
    public void addComponent(Component c){
        com.add(c);
    }

    @Override
    public void showPrice() {
        for(Component comp: com){
            comp.showPrice();
        }

    }
}
