package Behavioral.Visitor.AudioEditor;

public class FormatSegment extends Segment {

    @Override
    public void execute(AudioFilter filter) {
        filter.apply(this);
    }
}
