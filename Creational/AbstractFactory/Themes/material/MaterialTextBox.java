package Creational.AbstractFactory.Themes.material;

import Creational.AbstractFactory.Themes.TextBox;

public class MaterialTextBox implements TextBox {

    @Override
    public void render() {
        System.out.println("Material TextBox");
    }

}
