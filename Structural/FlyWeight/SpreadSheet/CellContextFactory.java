package Structural.FlyWeight.SpreadSheet;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CellContextFactory {
    private Map<Integer, CellContext> contexts = new HashMap<>();

    public CellContext getCellContext(String fontFamily, int fontSize, boolean isBold) {
        // Generate a unique key for combination of these
        var hash = Objects.hash(fontFamily, fontSize, isBold);
        if (!contexts.containsKey(hash))
            contexts.put(hash, new CellContext(fontFamily, fontSize, isBold));
        return contexts.get(hash);
    }
}
