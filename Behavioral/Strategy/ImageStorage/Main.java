package Behavioral.Strategy.ImageStorage;

public class Main {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage();
        imageStorage.Store("MML", new JpegCompressor(), new HighContrastFilter());
    }
}
