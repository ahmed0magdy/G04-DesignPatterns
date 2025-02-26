package Behavioral.ChainOfResponsibility.accounting;

public abstract class DataReader {
    private DataReader next;

    public void setNext(DataReader next) {
        this.next = next;
    }

    public void read(String filename) {
        if (filename.endsWith(hasExtension())) {
            this.doRead(filename);
            return;
        }

        if (next != null)
            next.read(filename);
        else
            throw new UnsupportedOperationException("File format not supported.");

    }

    protected abstract String hasExtension();

    protected abstract void doRead(String filename);

}
