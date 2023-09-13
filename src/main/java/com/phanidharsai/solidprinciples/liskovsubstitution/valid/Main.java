package com.phanidharsai.solidprinciples.liskovsubstitution.valid;

public class Main {
    public static void play(MediaPlayer mp){
        mp.playAudio();
    }
    public static void main(String[] args){
        MediaPlayer dvd = new DvdPlayer();
        MediaPlayer winamp = new WinampPlayer();
        play(dvd);
        play(winamp);
    }
}
