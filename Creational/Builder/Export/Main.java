package Creational.Builder.Export;

public class Main {
    public static void main(String[] args) {
        var slide1 = new Slide("GO4");
        var slide2 = new Slide("GO5");
        var slide3 = new Slide("GO6");
        var presentation = new Presentation();
        presentation.addSlide(slide1);
        presentation.addSlide(slide2);
        presentation.addSlide(slide3);
        var builder = new PdfDocumentBuilder();
        presentation.export(builder);
        builder.getPdfDocument();

        var mvbuilder = new MovieBuilder();
        presentation.export(mvbuilder);
        mvbuilder.getMovie();
    }

}
