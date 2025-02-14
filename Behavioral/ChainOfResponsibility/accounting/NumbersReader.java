package Behavioral.ChainOfResponsibility.accounting;

public class NumbersReader extends DataReader {

    @Override
    protected String hasExtension() {
        return ".numbers";
    }

    @Override
    protected void doRead(String filename) {
        System.out.println("Reading data from a Numbers spreadsheet.");
    }

}
