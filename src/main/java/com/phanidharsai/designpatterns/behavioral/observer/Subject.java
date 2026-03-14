package com.phanidharsai.designpatterns.behavioral.observer;

public interface Subject {
    void subscribe(Observer s);

    void unSubscribe(Observer s);

    void addVideo(String title);
}
