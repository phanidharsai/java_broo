/** Here in the play method we will get an exception as winamp doesn't support playing video which is a clear
 * violation of liskov substitution principle which states that parent class can replace a child class when required
 *
 * */

package com.phanidharsai.solidprinciples.liskovsubstitution.invalid;



public class Main {
    public static void play(MediaPlayer mp){
        mp.playAudio();
        mp.playVideo();
    }

    public static void main(String[] args){
    MediaPlayer dvd = new DvdPlayer();
    MediaPlayer winamp = new WinampPlayer();
    play(dvd);
    play(winamp);
    }
}
