package Creational.Prototype.Clone;

public class Circle implements Component {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void render() {
        System.out.println("Rendering a circle");
    }

    @Override
    public Component clone() {
        Circle copiedCircle = new Circle();
        copiedCircle.setRadius(radius);
        System.out.println("copy Circle");
        return copiedCircle;
    }

}
