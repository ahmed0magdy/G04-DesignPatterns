package Structural.Composite.groupShapes;

public class Shape implements Component{
    @Override
    public void render(){
        System.out.println("Render Shape");
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Move ON");
    }
}
