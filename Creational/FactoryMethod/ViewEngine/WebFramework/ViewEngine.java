package Creational.FactoryMethod.ViewEngine.WebFramework;

import java.util.Map;

public class ViewEngine implements IViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "Vieew rendered";
    }
}
