package Structural.Decorator.CodeEditor;

public class Main {
    public static void main(String[] args) {
        show();
    }

    public static void show() {
        var editor = new Editor();
        editor.openProject("...");
    }
}
