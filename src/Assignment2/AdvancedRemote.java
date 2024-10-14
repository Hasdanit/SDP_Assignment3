package src.Assignment2;

public class AdvancedRemote extends RemoteControl {

    public AdvancedRemote(Device device) {
        super(device);
    }



    @Override
    void powerOn() { device.powerOn(); }

    @Override
    void powerOff() { device.powerOff(); }

    @Override
    void setChannel(int channel) { device.setChannel(channel); }

    @Override
    void setVolume(int volume) { device.setVolume(volume); }
}
