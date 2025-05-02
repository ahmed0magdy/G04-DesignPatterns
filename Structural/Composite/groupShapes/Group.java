package Structural.Composite.groupShapes;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Shape> shapes = new ArrayList<>();

    public void add(Shape shape){
        shapes.add(shape);
    }
    
    public void render(){
        for(var shape:shapes)
        shape.render();
    }
}
