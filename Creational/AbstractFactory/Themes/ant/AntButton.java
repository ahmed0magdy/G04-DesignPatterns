package Creational.AbstractFactory.Themes.ant;

import Creational.AbstractFactory.Themes.TextBox;

public class AntButton implements TextBox {

    @Override
    public void render() {
        System.out.println("Ant Button");
    }

}
