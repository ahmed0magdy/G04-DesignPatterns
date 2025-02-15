package Behavioral.Visitor.HtmlEditor;

public interface Operation {
    void apply(AnchorNode anchor);

    void apply(HeadingNode heading);
}
