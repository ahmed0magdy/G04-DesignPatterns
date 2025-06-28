package Creational.Prototype.Clone;

public class ContextMenu {
    public void duplicate(Component component) {
        if (component instanceof Circle) {
            Circle source = (Circle) component;
            Circle target = new Circle();
            target.setRadius(source.getRadius());
            // Add target to document
            System.out.println("copy Circle");

        }

    }
}
