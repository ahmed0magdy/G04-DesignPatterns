package Creational.AbstractFactory.Themes;

import Creational.AbstractFactory.Themes.ant.AntWidgetFactory;
import Creational.AbstractFactory.Themes.app.ContactForm;
import Creational.AbstractFactory.Themes.material.MaterialWidgetFactory;

public class Main {
    public static void main(String[] args) {
        new ContactForm().render(new AntWidgetFactory());
        ;
    }

}
