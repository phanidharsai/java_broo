package com.phanidharsai.designpatterns.behavioral.observer;

public class Youtube {
    public static void main(String[] args){
        Channel alpha = new Channel();
        alpha.cName="ALPHA";

        Subscriber s1 = new Subscriber("you");
        Subscriber s2 = new Subscriber("there");

//        s1.addChannel(alpha);
//        s2.addChannel(alpha);

        alpha.subscribe(s1);
        alpha.subscribe(s2);

        alpha.addVideo("stillThinking");
        System.out.println(s1.channel);
        System.out.println(s1);

    }
}
