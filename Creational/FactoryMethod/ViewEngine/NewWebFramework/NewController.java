package Creational.FactoryMethod.ViewEngine.NewWebFramework;

import Creational.FactoryMethod.ViewEngine.WebFramework.Controller;

public class NewController extends Controller {
    @Override
    protected NewViewEngine createViewEngine() {
        return new NewViewEngine();
    }
}
