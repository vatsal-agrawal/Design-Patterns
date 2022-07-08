package Structural.Adapter;

public class MP4Player implements MediaPackage{
    @Override
    public void playFile(String file) {
        System.out.println("MP4 player");
    }
}
