package Structural.Composite.groupShapes;

public class Main {
    public static void main(String[] args) {
        var grp1 = new Group();
        grp1.add(new Shape()); // square
        grp1.add(new Shape()); // square

        var grp2 = new Group();
        grp2.add(new Shape()); // circle
        grp2.add(new Shape()); // circle

        var grp = new Group();
        grp.add(grp1);
        grp.add(grp2);
        grp.render();
        grp.move(1, 2);
    }
}