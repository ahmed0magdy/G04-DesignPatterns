package Behavioral.Visitor.HtmlEditor;

public class AnchorNode implements HtmlNode {

    @Override
    public void highlight() {
        System.out.println("hi ghlight-anchor");
    }

}
