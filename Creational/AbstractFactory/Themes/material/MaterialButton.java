package Creational.AbstractFactory.Themes.material;

import Creational.AbstractFactory.Themes.Button;

public class MaterialButton implements Button {

    @Override
    public void render() {
        System.out.println("Material Button");
    }

}
