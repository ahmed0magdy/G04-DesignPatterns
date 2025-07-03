package Creational.FactoryMethod.ViewEngine;

import java.util.HashMap;
import java.util.Map;

import Creational.FactoryMethod.ViewEngine.WebFramework.Controller;
import Creational.FactoryMethod.ViewEngine.WebFramework.ViewEngine;

public class ProductsController extends Controller {
    public void listProducts() {
        // get products from db
        String[] products = { "a", "b", "c" };
        Map<String, Object> context = new HashMap<>();
        context.put("products.html", products);
        render("products.html", context, new ViewEngine());
    }
}
