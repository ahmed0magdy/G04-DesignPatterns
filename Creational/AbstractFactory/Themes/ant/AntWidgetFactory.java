package Creational.AbstractFactory.Themes.ant;

import Creational.AbstractFactory.Themes.Button;
import Creational.AbstractFactory.Themes.TextBox;
import Creational.AbstractFactory.Themes.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {

    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AntTextBox();
    }

}
