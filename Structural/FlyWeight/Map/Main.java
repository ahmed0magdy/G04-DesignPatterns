package Structural.FlyWeight.Map;

public class Main {
    public static void main(String[] args) {
        var service = new PointService(new PointIconFactory());
        for (var point : service.getPoints())
            point.draw();
    }
}
