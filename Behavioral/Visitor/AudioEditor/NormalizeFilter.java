package Behavioral.Visitor.AudioEditor;

public class NormalizeFilter implements AudioFilter {

    @Override
    public void apply(FactSegment fact) {
        System.out.println("Normalize on fact segment");
    }

    @Override
    public void apply(FormatSegment format) {
        System.out.println("Normalize on format segment");
    }

}
