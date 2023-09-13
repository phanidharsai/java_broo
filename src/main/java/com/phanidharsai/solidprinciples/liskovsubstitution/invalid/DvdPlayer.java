package com.phanidharsai.solidprinciples.liskovsubstitution.invalid;

public class DvdPlayer implements MediaPlayer {
    @Override
    public void playAudio() {
        System.out.println("playing audio in dvd");
    }

    @Override
    public void playVideo() {
        System.out.println("playing video in dvd");
    }
}
