package Structural.Adapter;

public class Client {
    public static void main(String[] args) {
        MediaPlayer formatAdapter = new FormatAdapter(new VLCPlayer());

        formatAdapter.play("VLC");

        MediaPlayer mp3 = new MP3Player();
        mp3.play("");


    }
}
