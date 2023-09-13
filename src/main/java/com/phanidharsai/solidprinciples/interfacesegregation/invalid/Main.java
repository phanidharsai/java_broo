/** here we are forced to implement playVideo method in winamp even though it doesn't support so to overcome these
 * type of unwanted implementations interface segregation principle is used
 * */
package com.phanidharsai.solidprinciples.interfacesegregation.invalid;

public class Main {
    public static void play(MediaPlayer mp){
        mp.playAudio();
        mp.playVideo();
    }
    public static void main(String[] args){
        MediaPlayer dvd = new DvdPlayer();
        MediaPlayer winamp= new WinampPlayer();
        play(dvd);
        play(winamp);
    }
}
