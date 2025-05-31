package Structural.FlyWeight.Map;

import java.util.ArrayList;
import java.util.List;

public class PointService {
    private PointIconFactory iconFactory;

    public PointService(PointIconFactory iconFactory) {
        this.iconFactory = iconFactory;
    }

    public List<Point> getPoints() {
        List<Point> points = new ArrayList<>();

        // Get the flyweight object from the factory
        var cafeIcon = iconFactory.getPointIcon(PointType.CAFE);

        // Create points with the same icon object
        points.add(new Point(1, 2, cafeIcon));
        points.add(new Point(3, 4, cafeIcon));

        // Get another flyweight object
        var hospitalIcon = iconFactory.getPointIcon(PointType.HOSPITAL);
        points.add(new Point(5, 6, hospitalIcon));

        // Reuse the cafe icon for another point
        points.add(new Point(7, 8, cafeIcon));

        return points;
    }
}
