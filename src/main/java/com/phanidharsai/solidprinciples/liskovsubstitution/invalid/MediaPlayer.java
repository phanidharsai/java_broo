package com.phanidharsai.solidprinciples.liskovsubstitution.invalid;

public interface MediaPlayer {
    public void playAudio();
    public void playVideo();
}

/*
*   Consider a MediaPlayer interface and a DvdPlayer subclass. If the MediaPlayer class has a playVideo method,
*   an implementing class like DvdPlayer would work fine but if an implementing class like WinampPlayer is created, then it will
*   violate LSP because WinampPlayer do not have video feature.
* */