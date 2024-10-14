package src.Assignment2;

public class TVDevice implements Device {
    private int channel;
    private int volume;

    public void powerOn() { System.out.println("TV is ON"); }

    public void powerOff() { System.out.println("TV is OFF"); }

    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("TV Channel set to " + channel);
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("TV Volume set to " + volume);
    }
}
