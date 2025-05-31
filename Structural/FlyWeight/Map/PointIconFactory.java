package Structural.FlyWeight.Map;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {
    private Map<PointType, PointIcon> icons = new HashMap<>();

    public PointIcon getPointIcon(PointType type) {
        if (!icons.containsKey(type))
            icons.put(type, new PointIcon(type, new byte[20000]));

        return icons.get(type);
    }
}
