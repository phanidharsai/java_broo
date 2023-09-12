package com.phanidharsai.designpatterns.behavioral.observer;

public class Subscriber implements Observer {
    public String name;
    public Channel channel;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void addChannel(Channel ch) {
        this.channel=ch;
    }

    @Override
    public void giveNotification(String channelName,String title){
        System.out.println("hey "+ name +", new video uploaded from " +channelName+" title is: " +title);
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "name='" + name + '\'' +
                ", channel=" + channel +
                '}';
    }
}
