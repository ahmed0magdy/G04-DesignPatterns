package Behavioral.State.Canvas;

public class Main {
    public static void main(String[] args) {
        canvas canvas = new canvas(new Selection());
        // canvas.setCurrentTool(new Brush());
        // canvas.setCurrentTool(new Selection());
        canvas.mouseDown();
        canvas.mouseUp();

    }

}
