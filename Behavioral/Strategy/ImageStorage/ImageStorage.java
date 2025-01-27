package Behavioral.Strategy.ImageStorage;

public class ImageStorage {
    private String compressor;
    private String filter;

    public ImageStorage(String compression, String filter) {
        this.compressor = compression;
        this.filter = filter;
    }

    public void Store(String filename) {
        if (compressor == "jpeg")
            System.out.println("compressing using JPEG");
        else if (compressor == "png")
            System.out.println("compressing using PNG");

        if (filter == "b&w")
            System.out.println("Applying B&w filter");
        else if (filter == "high-contrast")
            System.out.println("Applying High-Contrast filter");
    }
}
