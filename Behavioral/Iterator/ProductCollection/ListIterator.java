package Behavioral.Iterator.ProductCollection;

public class ListIterator implements Iterator {
    private ProductCollection collection;
    private int index;

    public ListIterator(ProductCollection collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return (index < collection.getProducts().size());
    }

    @Override
    public Product current() {
        return collection.getProducts().get(index);
    }

    @Override
    public void next() {
        index++;
    }

}
