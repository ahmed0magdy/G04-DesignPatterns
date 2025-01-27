package Behavioral.Strategy.ImageStorage;

public class JpegCompressor implements Compressor {

    @Override
    public void compress(String filename) {
        System.out.println("compressing using JPEG");
    }

}
