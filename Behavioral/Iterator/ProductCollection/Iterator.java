package Behavioral.Iterator.ProductCollection;

public interface Iterator {
    boolean hasNext();

    Product current();

    void next();

}
