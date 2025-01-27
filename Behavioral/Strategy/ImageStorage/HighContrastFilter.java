package Behavioral.Strategy.ImageStorage;

public class HighContrastFilter implements Filter {

    @Override
    public void apply(String filename) {
        System.out.println("Applying High-Contrast filter");
    }

}
