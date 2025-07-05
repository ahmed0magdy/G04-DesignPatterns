package Creational.Builder.WordProcessor;

public interface DocumentBuilder {
    void addText(Text text);

    void addImage(Image image);

    String getResult();
}
