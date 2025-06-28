package Creational.Prototype.VideoEditor;

public class Audio implements Component {
    @Override
    public Component clone() {
        Audio copiedAudio = new Audio();
        System.out.println("cloning Audio");
        return copiedAudio;
    }
}
