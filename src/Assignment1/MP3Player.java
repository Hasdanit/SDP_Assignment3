package src.Assignment1;

public class MP3Player implements AudioPlayer {
    public void play(String audioType, String fileName) {
        System.out.println("Playing MP3 file. Name: " + fileName);
    }
}