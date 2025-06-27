package Structural.Bridge;

public class Main {
    public static void main(String[] args) {
        var remote = new RemoteControl(new SamsungControl());
        remote.turnOn();
        var advancedControl = new AdvancedRemoteControl(new SonyControl());
        advancedControl.turnOn();
        advancedControl.setChannel(7);
    }
}
