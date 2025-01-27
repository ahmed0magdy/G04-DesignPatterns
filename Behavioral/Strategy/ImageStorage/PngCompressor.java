package Behavioral.Strategy.ImageStorage;

public class PngCompressor implements Compressor {

    @Override
    public void compress(String filename) {
        System.out.println("compressing using PNG");
    }

}
