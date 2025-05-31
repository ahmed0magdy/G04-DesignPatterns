package Structural.FlyWeight.Map;

public class Main {
    public static void main(String[] args) {
        var service = new PointService(new PointIconFactory());
        for (var point : service.getPoints())
            point.draw();
        // Memory usage demonstration
        System.out.println("\nMemory usage:");
        System.out.println("With Flyweight Pattern: 4 points sharing 2 icons");
        System.out.println("Without Flyweight Pattern: Each point would have its own 20KB icon");
    }
}
