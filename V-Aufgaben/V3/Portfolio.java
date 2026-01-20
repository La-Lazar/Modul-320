import java.util.ArrayList;
import java.util.List;

public class Portfolio {

    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public void printPortfolioValue(StockExchange exchange) {
        double total = 0;

        for (Stock stock : stocks) {
            double price = exchange.getPrice(stock.getSymbol());
            double value = price * stock.getQuantity();
            total += value;

            System.out.println(
                stock.getSymbol() + ": " +
                stock.getQuantity() + " x " +
                price + " = " + value
            );
        }

        System.out.println("Gesamtwert: " + total);
        System.out.println("------------------------");
    }
}
