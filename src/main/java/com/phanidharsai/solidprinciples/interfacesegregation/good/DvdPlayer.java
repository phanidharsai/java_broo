package com.phanidharsai.solidprinciples.interfacesegregation.good;

public class DvdPlayer implements APlayer,AVPlayer {
    @Override
    public void playAudio() {
        System.out.println("playing audio in dvd");
    }

    @Override
    public void playVideo() {
        System.out.println("playing video in dvd");
    }
}
