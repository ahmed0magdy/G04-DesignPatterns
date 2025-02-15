package Behavioral.Visitor.AudioEditor;

public interface AudioFilter {
    public void apply(FactSegment fact);

    public void apply(FormatSegment format);
}
