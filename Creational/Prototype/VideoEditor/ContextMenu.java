package Creational.Prototype.VideoEditor;

public class ContextMenu {
    private Timeline timeline;

    public ContextMenu(Timeline timeline) {
        this.timeline = timeline;
    }

    public void duplicate(Component component) {
        var target = component.clone();
        timeline.add(target);

    }
}
