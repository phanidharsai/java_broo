package com.phanidharsai.designpatterns.behavioral.observer;

public class PushNotificationSubscriber implements Observer{
    public String name;
    public Channel channel;

    public PushNotificationSubscriber(String name) {
        this.name = name;
    }



    @Override
    public void addChannel(Channel ch) {

    }

    @Override
    public void giveNotification(String title) {
        System.out.println("Push notification: hey "+ name +", new video uploaded from " +this.channel.cName+" title is: " +title);

    }
}
