package Structural.Adapter.imageFilter;

public class Main {

    public static void main(String[] args) {
        var image = new ImageView(new Image());
        image.apply(new VividFilter());
    }
}