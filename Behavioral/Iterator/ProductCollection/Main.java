package Behavioral.Iterator.ProductCollection;

public class Main {
    public static void main(String[] args) {
        var collection = new ProductCollection();
        collection.add(new Product(1, "Car"));
        collection.add(new Product(2, "House"));
        collection.add(new Product(3, "Laptop"));

        var iterator = collection.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
