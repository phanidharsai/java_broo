package com.phanidharsai.solidprinciples.liskovsubstitution.valid;

public class DvdPlayer implements MediaPlayer {
    @Override
    public void playAudio() {
        System.out.println("playing audio in dvd");
    }
    public void playVideo(){
        System.out.println("playing video in dvd");

    }
}
