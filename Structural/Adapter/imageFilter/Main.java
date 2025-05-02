package Structural.Adapter.imageFilter;

import Structural.Adapter.imageFilter.megoFilters.Caramel;

public class Main {

    public static void main(String[] args) {
        var image = new ImageView(new Image());
        image.apply(new VividFilter());
        image.apply(new CaramelFilter(new Caramel()));
        image.apply(new CaramelAdapter());
    }
}