package Creational.AbstractFactory.Themes.app;

import Creational.AbstractFactory.Themes.WidgetFactory;

public class ContactForm {
    public void render(WidgetFactory factory) {
        factory.createTextBox().render();
        factory.createButton().render();
    }
}
