package Behavioral.State.Canvas;

public class canvas {
    private Tool currentTool;

    public canvas(Tool currenTool) {
        this.currentTool = currenTool;
    }

    public void mouseDown() {
        currentTool.mouseDown();
    }

    public void mouseUp() {
        currentTool.mouseUp();
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }

}
