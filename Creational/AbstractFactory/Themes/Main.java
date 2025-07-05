package Creational.AbstractFactory.Themes;

import Creational.AbstractFactory.Themes.app.ContactForm;

public class Main {
    public static void main(String[] args) {
        new ContactForm().render(Theme.Material);
    }

}
