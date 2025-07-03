package Creational.FactoryMethod.ViewEngine;

import java.util.HashMap;
import java.util.Map;

import Creational.FactoryMethod.ViewEngine.NewWebFramework.NewController;
import Creational.FactoryMethod.ViewEngine.WebFramework.Controller;

public class ProductsController extends NewController {
    public void listProducts() {
        // get products from db
        String[] products = { "a", "b", "c" };
        Map<String, Object> context = new HashMap<>();
        context.put("products.html", products);
        render("products.html", context);
    }
}
