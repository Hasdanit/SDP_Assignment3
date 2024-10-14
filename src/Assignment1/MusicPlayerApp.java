package src.Assignment1;

public class MusicPlayerApp {
    public static void main(String[] args) {
        AudioPlayer player = new MP3Player();
        player.play("MP3", "song.mp3");

        AudioAdapter adapter = new AudioAdapter("WAV");
        adapter.play("WAV", "song.wav");

        adapter = new AudioAdapter("AAC");
        adapter.play("AAC", "song.aac");
    }
}
