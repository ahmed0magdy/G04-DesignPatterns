package Behavioral.State.Canvas;

public class canvas {
    private ToolType currentTool;

    public void mouseDown() {
        if (currentTool == ToolType.SELECTION)
            System.out.println("SelectionIcon");
        else if (currentTool == ToolType.BRUSH)
            System.out.println("BrushIcon");
        else if (currentTool == ToolType.ERASER)
            System.out.println("EraserIcon");
    }

    public void mouseUp() {
        if (currentTool == ToolType.SELECTION)
            System.out.println("Draw dashed rectangle");
        else if (currentTool == ToolType.BRUSH)
            System.out.println("Draw a line");
        else if (currentTool == ToolType.ERASER)
            System.out.println("Erase something");
    }

    public ToolType getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(ToolType currentTool) {
        this.currentTool = currentTool;
    }
}
