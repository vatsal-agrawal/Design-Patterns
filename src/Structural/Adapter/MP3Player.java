package Structural.Adapter;

public class MP3Player implements MediaPlayer{
    @Override
    public void play(String file) {
        System.out.println("MP3 player");
    }
}
