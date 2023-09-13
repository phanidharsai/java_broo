package com.phanidharsai.solidprinciples.liskovsubstitution.invalid;

public class WinampPlayer implements MediaPlayer {
    @Override
    public void playAudio() {
        System.out.println("playing audio in winamp");

    }

    @Override
    public void playVideo() {
        throw new UnsupportedOperationException("video not supported in winamp");
    }
}
