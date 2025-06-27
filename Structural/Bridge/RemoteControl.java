package Structural.Bridge;

public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void turnOn() {
        device.turnOn();
    };

    public void turnoff() {
        device.turnOff();
    };
}
