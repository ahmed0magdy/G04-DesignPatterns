package Creational.AbstractFactory.Themes.ant;

import Creational.AbstractFactory.Themes.Button;

public class AntButton implements Button {

    @Override
    public void render() {
        System.out.println("Ant Button");
    }

}
