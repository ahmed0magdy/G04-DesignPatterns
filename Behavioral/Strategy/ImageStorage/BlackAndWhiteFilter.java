package Behavioral.Strategy.ImageStorage;

public class BlackAndWhiteFilter implements Filter {

    @Override
    public void apply(String filename) {
        System.out.println("Applying B&w filter");
    }

}
