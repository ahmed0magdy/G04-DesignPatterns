package Behavioral.Observer.Stocks;

import java.util.ArrayList;
import java.util.List;

public class StockListView implements Observer {
    private List<Stock> stocks = new ArrayList<>();
    private Stock stock;

    public StockListView(Stock stock) {
        this.stock = stock;
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public void show() {
        for (var stock : stocks)
            System.out.println(stock);
    }

    @Override
    public void update() {
        System.out.println("Stock List View got updated: " + stock.getPrice());
    }
}
