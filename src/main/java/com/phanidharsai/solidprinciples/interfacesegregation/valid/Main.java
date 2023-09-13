package com.phanidharsai.solidprinciples.interfacesegregation.valid;

public class Main {

    public static void main(String[] args){
        AVPlayer dvd= new DvdPlayer();
        APlayer winamp = new WinampPlayer();
        dvd.playAudio();
        dvd.playVideo();
        winamp.playAudio();

    }
}
