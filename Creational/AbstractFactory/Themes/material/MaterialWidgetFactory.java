package Creational.AbstractFactory.Themes.material;

import Creational.AbstractFactory.Themes.Button;
import Creational.AbstractFactory.Themes.TextBox;
import Creational.AbstractFactory.Themes.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {

    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MaterialTextBox();
    }

}
