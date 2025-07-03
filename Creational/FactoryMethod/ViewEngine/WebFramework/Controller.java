package Creational.FactoryMethod.ViewEngine.WebFramework;

import java.util.Map;

public class Controller {
    public void render(String viewName, Map<String, Object> context, IViewEngine engine) {
        var html = engine.render(viewName, context);
        System.out.println(html);
    }
}
