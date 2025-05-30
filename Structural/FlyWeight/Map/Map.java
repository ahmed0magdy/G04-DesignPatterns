package Structural.FlyWeight.Map;

public class Map {
    public static void main(String[] args) {
        var service = new PointService();
        for (var point : service.getPoints())
            point.draw();
    }
}
