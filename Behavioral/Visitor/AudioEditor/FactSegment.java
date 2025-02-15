package Behavioral.Visitor.AudioEditor;

public class FactSegment extends Segment {

    @Override
    public void execute(AudioFilter filter) {
        filter.apply(this);
    }

}
