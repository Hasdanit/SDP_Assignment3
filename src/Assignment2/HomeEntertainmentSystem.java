package src.Assignment2;

public class HomeEntertainmentSystem {
    public static void main(String[] args) {
        Device tv = new TVDevice();
        RemoteControl remote = new BasicRemote(tv);
        remote.powerOn();
        remote.setChannel(5);
        remote.setVolume(10);

        Device dvd = new DVDDevice();
        remote = new BasicRemote(dvd);
        remote.powerOn();
        remote.setVolume(15);

        Device soundSystem = new SoundSystemDevice();
        remote = new AdvancedRemote(soundSystem);
        remote.powerOn();
        remote.setVolume(20);
    }
}
