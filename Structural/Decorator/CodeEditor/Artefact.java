package Structural.Decorator.CodeEditor;

public class Artefact implements Marker {
    private String name;


    public Artefact(String name) {
        this.name = name;
    }
    @Override
    public String render() {
        return String.format("%s", name);
    }






}
