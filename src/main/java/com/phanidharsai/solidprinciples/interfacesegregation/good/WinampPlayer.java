package com.phanidharsai.solidprinciples.interfacesegregation.good;

public class WinampPlayer implements APlayer {
    @Override
    public void playAudio() {
        System.out.println("playing audio in winamp");

    }
}
