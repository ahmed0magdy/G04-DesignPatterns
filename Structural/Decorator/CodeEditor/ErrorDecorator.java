package Structural.Decorator.CodeEditor;

public class ErrorDecorator implements Marker {
    private Marker marker;

    protected ErrorDecorator(Marker marker) {
            this.marker = marker;
        }  
        
        @Override
        public String render() {
return marker.render() + " [Error]";
        }

}
