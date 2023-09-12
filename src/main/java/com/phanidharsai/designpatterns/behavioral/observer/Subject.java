package com.phanidharsai.designpatterns.behavioral.observer;

public interface Subject {
    void subscribe(Subscriber s);

    void unSubscribe(Subscriber s);

    void addVideo(String title);
}
