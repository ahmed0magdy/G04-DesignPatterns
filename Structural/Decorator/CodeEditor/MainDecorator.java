package Structural.Decorator.CodeEditor;

public class MainDecorator implements Marker {
    private Marker marker;
    protected MainDecorator(Marker marker) {
        this.marker = marker;
    }

    @Override
    public String render() {
return marker.render()+ " [Main]";
}

}
