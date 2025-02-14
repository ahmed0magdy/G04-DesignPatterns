package Behavioral.Visitor.HtmlEditor;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {
    private List<HtmlNode> nodes = new ArrayList<>();

    public void add(HtmlNode node) {
        nodes.add(node);
    }

    public void hightlight() {
        for (var node : nodes)
            node.highlight(); // polymorphism
    }
    // to extract plain text implement here and interface with all concrete
    // implementation and

}
