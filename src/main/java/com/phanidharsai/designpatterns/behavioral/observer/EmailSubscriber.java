package com.phanidharsai.designpatterns.behavioral.observer;

public class EmailSubscriber implements Observer {
    public String name;
    public Channel channel;

    public EmailSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void addChannel(Channel ch) {
        this.channel=ch;
    }

    @Override
    public void giveNotification(String title){

        System.out.println("Email notification: hey "+ name +", new video uploaded from " +this.channel.cName+" title is: " +title);
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "name='" + name + '\'' +
                ", channel=" + channel +
                '}';
    }
}
