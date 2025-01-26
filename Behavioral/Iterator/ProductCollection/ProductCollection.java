package Behavioral.Iterator.ProductCollection;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
  private List<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }

  public Iterator createIterator() {
    return new ListIterator(this);
  }

  public List<Product> getProducts() {
    return products;
  }
}
