package Structural.Bridge;

public class SamsungAdvancedControl extends AdvancedRemoteControl {

    @Override
    public void setChannel() {
        System.out.println("samsung: setChannel");

    }

    @Override
    public void turnOn() {
        System.out.println("samsung: turn on");

    }

    @Override
    public void turnoff() {
        System.out.println("samsung: turn off");

    }

}
