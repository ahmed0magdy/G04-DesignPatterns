package Creational.Prototype.VideoEditor;

public class Clip implements Component {
    @Override
    public Component clone() {
        Clip copiedClip = new Clip();
        System.out.println();
        return copiedClip;
    }
}
