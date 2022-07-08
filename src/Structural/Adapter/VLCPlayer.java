package Structural.Adapter;

public class VLCPlayer implements MediaPackage{
    @Override
    public void playFile(String file) {

        System.out.println("VLC player");
    }
}
