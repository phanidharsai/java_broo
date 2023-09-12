package com.phanidharsai.designpatterns.behavioral.observer;

public interface Observer {

    public void addChannel(Channel ch);
    void giveNotification(String title);
}
