package com.phanidharsai.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    public String cName;
    private List<Subscriber> subs = new ArrayList<>();

    @Override
    public void subscribe(Subscriber s){
        subs.add(s);
    }
    @Override
    public void unSubscribe(Subscriber s){
        subs.remove(s);
    }
    @Override
    public void addVideo(String title){
//        this.cName=cName;
        for(Subscriber s:subs){
            s.giveNotification(cName,title);
        }
    }

    @Override
    public String toString() {
        return "Channel{" +
                "cName='" + cName + '\'' +
                '}';
    }
}
