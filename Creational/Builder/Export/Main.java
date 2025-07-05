package Creational.Builder.Export;

public class Main {
    public static void main(String[] args) {
        var slide = new Slide("GO4");
        var presentation = new Presentation();
        presentation.addSlide(slide);
        presentation.export(PresentationFormat.PDF);
    }

}
