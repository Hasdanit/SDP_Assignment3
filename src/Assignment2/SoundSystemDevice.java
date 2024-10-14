package src.Assignment2;

public class SoundSystemDevice implements Device {
    private int volume;

    public void powerOn() { System.out.println("Sound System is ON"); }

    public void powerOff() { System.out.println("Sound System is OFF"); }

    public void setChannel(int channel) { /* Not applicable */ }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Sound System Volume set to " + volume);
    }
}
