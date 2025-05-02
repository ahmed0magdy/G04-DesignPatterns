package Structural.Adapter.imageFilter;

import Structural.Adapter.imageFilter.megoFilters.Caramel;

public class CaramelFilter implements Filter {
    private Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
caramel.init();
caramel.render(image);
    }
    
}
