package Behavioral.ChainOfResponsibility.accounting;

public class ExcelReader extends DataReader {

    @Override
    protected String hasExtension() {
        return ".xls";
    }

    @Override
    protected void doRead(String filename) {
        System.out.println("Reading data from an Excel spreadsheet.");
    }

}
