package com.phanidharsai.designpatterns.behavioral.observer;

public class Youtube {
    public static void main(String[] args){
        Channel c1 = new Channel();
        c1.cName="ALPHA";
        Channel c2 = new Channel();
        c2.cName="GAMMA";

        EmailSubscriber s1 = new EmailSubscriber("you");
        PushNotificationSubscriber s2 = new PushNotificationSubscriber("there");

        s1.channel=c1;
        s2.channel=c2;

        c1.subscribe(s1);
        c2.subscribe(s2);

        c1.addVideo("stillThinking");
        c2.addVideo("almostThere");

        System.out.println(c2);
//        System.out.println(c1);

    }
}
