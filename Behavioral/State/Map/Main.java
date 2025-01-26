package Behavioral.State.Map;

public class Main {
    public static void main(String[] args) {
        var map = new DirectionService(new Driving());
        map.getEta();
        map.getDirection();
    }
}
