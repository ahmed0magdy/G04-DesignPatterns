package Behavioral.Observer.Stocks;

public class Main {
    public static void main(String[] args) {
        var stock = new Stock("stock1", 500);
        var statusBar = new StatusBar(stock);
        var stockListView = new StockListView(stock);
        stock.addObserver(statusBar);
        stock.addObserver(stockListView);
        stock.setPrice(600);
    }
}
