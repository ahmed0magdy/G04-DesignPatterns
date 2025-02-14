package Behavioral.Visitor.HtmlEditor;

public class HeadingNode implements HtmlNode {

    @Override
    public void highlight() {
        System.out.println("highlight-heading");
    }

}
