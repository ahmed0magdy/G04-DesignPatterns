package Behavioral.Visitor.AudioEditor;

public class NoiseReductionFilter implements AudioFilter {

    @Override
    public void apply(FactSegment fact) {
        System.out.println("Reduce noise on Fact segment");
    }

    @Override
    public void apply(FormatSegment format) {
        System.out.println("Reduce noise on format segment");
    }

}
