package Structural.Adapter.imageFilter;

public class VividFilter implements Filter {

    @Override
    public void apply(Image image) {
System.out.println("apply vivid filter");
    }
    
}
