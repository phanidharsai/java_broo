package com.phanidharsai.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    public String cName;
    private List<Observer> subs = new ArrayList<>();

    @Override
    public void subscribe(Observer s){
        subs.add(s);
    }
    @Override
    public void unSubscribe(Observer s){
        subs.remove(s);
    }
    @Override
    public void addVideo(String title){
//        this.cName=cName;
        for(Observer s:subs){
            s.giveNotification(title);
        }
    }

    @Override
    public String toString() {
        return "Channel{" +
                "cName='" + this.cName + '\'' +
                '}';
    }
}
