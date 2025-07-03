package Creational.FactoryMethod.ViewEngine.WebFramework;

import java.util.Map;

public class Controller {
    public void render(String viewName, Map<String, Object> context) {
        var engine = new ViewEngine();
        var html = engine.render(viewName, context);
        System.out.println(html);
    }
}
