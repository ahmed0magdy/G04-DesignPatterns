package Behavioral.Visitor.HtmlEditor;

public class PlainTextOperation implements Operation {

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("text-anchor");
    }

    @Override
    public void apply(HeadingNode heading) {
        System.out.println("text-heading");
    }

}
