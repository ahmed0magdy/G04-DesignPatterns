package Behavioral.State.Canvas;

public class Brush implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("BrushIcon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a line");
    }

}
