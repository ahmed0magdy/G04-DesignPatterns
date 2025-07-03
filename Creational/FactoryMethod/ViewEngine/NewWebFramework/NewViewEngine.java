package Creational.FactoryMethod.ViewEngine.NewWebFramework;

import java.util.Map;

import Creational.FactoryMethod.ViewEngine.WebFramework.IViewEngine;

public class NewViewEngine implements IViewEngine {

    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "View returned by the new one";
    }

}
