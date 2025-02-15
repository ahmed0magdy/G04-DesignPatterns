package Behavioral.Visitor.HtmlEditor;

public class HeadingNode implements HtmlNode {

    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }

}
