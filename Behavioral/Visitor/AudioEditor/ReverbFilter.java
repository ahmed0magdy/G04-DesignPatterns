package Behavioral.Visitor.AudioEditor;

public class ReverbFilter implements AudioFilter {

    @Override
    public void apply(FactSegment fact) {
        System.out.println("Add reverb on fact segment");
    }

    @Override
    public void apply(FormatSegment format) {
        System.out.println("Add reverb on format segment");
    }

}
