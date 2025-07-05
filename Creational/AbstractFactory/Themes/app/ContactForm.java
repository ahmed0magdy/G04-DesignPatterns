package Creational.AbstractFactory.Themes.app;

import Creational.AbstractFactory.Themes.Theme;
import Creational.AbstractFactory.Themes.ant.AntButton;
import Creational.AbstractFactory.Themes.ant.AntTextBox;
import Creational.AbstractFactory.Themes.material.MaterialButton;
import Creational.AbstractFactory.Themes.material.MaterialTextBox;

public class ContactForm {
    public void render(Theme theme) {
        if (theme == Theme.Ant) {
            new AntTextBox().render();
            new AntButton().render();
        } else if (theme == Theme.Material) {
            new MaterialTextBox().render();
            new MaterialButton().render();
        }
    }
}
