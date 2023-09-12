package com.phanidharsai.designpatterns.behavioral.observer;

public class Youtube {
    public static void main(String[] args){
        Channel c1 = new Channel();
        c1.cName="ALPHA";
        Channel c2 = new Channel();
        c2.cName="GAMMA";

        Subscriber s1 = new Subscriber("you");
        Subscriber s2 = new Subscriber("there");

        s1.channel=c1;
        s2.addChannel(c2);

        c1.subscribe(s1);
        c2.subscribe(s2);

        c1.addVideo("stillThinking");
        c2.addVideo("almostThere");

        System.out.println(s1.channel);
        System.out.println(s1);

    }
}
