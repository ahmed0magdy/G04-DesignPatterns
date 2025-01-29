package Behavioral.Observer.Stocks;

import java.util.ArrayList;
import java.util.List;

public class StatusBar implements Observer {
    private List<Stock> stocks = new ArrayList<>();
    private Stock stock;

    public void addStock(Stock stock) {
        this.stock = stock;
        stocks.add(stock);
        stock.addObserver(this);
    }

    public void show() {
        System.out.println("Status Bar");
        for (var stock : stocks)
            System.out.println(stock);
    }

    @Override
    public void update() {
        System.out.println("StatusBar gets updated: " + stock.getPrice());
        show();
    }
}
