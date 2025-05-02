package Structural.Adapter.imageFilter;

import Structural.Adapter.imageFilter.megoFilters.Caramel;

public class CaramelAdapter extends Caramel implements Filter {

    @Override
    public void apply(Image image) {
init();
render(image);
    }
    
}
