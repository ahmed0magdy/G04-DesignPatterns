package Behavioral.State.Canvas;

public class Selection implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("SelectionIcon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw dashed rectangle");
    }

}
