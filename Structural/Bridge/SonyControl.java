package Structural.Bridge;

public class SonyControl implements Device {

    @Override
    public void turnOn() {
        System.out.println("sony: turn on");

    }

    @Override
    public void turnOff() {
        System.out.println("sony: turn off");

    }

    @Override
    public void setChannel(int channel) {
        System.out.println("samsung: set channel " + channel);
    }

}
