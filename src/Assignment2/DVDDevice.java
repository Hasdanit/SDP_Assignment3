package src.Assignment2;

public class DVDDevice implements Device {
    private int volume;

    public void powerOn() { System.out.println("DVD Player is ON"); }

    public void powerOff() { System.out.println("DVD Player is OFF"); }

    public void setChannel(int channel) {}

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("DVD Volume set to " + volume);
    }
}
