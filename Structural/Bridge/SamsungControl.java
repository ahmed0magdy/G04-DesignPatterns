package Structural.Bridge;

public class SamsungControl extends RemoteControl {

    @Override
    public void turnOn() {
        System.out.println("samsung: turn on");
    }

    @Override
    public void turnoff() {
        System.out.println("samsung: turn off");

    }

}
