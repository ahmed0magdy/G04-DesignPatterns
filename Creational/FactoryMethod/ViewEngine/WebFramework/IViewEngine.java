package Creational.FactoryMethod.ViewEngine.WebFramework;

import java.util.Map;

public interface IViewEngine {
    String render(String viewName, Map<String, Object> context);

}
