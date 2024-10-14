package src.Assignment2;

public abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    abstract void powerOn();

    abstract void powerOff();

    abstract void setChannel(int channel);

    abstract void setVolume(int volume);
}
