package Structural.Bridge;

public class Main {
    public static void main(String[] args) {
        var remote = new SamsungControl();
        remote.turnOn();
        var Advancedremote = new SamsungAdvancedControl();
        Advancedremote.setChannel();
    }
}
