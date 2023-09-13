package com.phanidharsai.solidprinciples.liskovsubstitution.valid;

public class WinampPlayer implements MediaPlayer{
    @Override
    public void playAudio() {
        System.out.println("winamp playing audio");
    }
}
