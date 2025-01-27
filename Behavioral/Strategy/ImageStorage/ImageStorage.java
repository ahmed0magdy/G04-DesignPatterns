package Behavioral.Strategy.ImageStorage;

public class ImageStorage {

    public void Store(String filename, Compressor compressor, Filter filter) {
        compressor.compress(filename);
        filter.apply(filename);
    }
}
