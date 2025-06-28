package Creational.Prototype.Clone;

public class Main {
    public static void main(String[] args) {
        var circle = new Circle();
        var ContextMenu = new ContextMenu();
        ContextMenu.duplicate(circle);
    }
}
