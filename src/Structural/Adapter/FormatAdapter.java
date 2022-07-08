package Structural.Adapter;

public class FormatAdapter implements MediaPlayer{
    MediaPackage mediaPackage;
    FormatAdapter(MediaPackage mediaPackage){
        this.mediaPackage = mediaPackage;
    }
    @Override
    public void play(String file) {
        mediaPackage.playFile(file);
    }
}
