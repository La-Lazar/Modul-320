import java.util.HashMap;
import java.util.Map;

public class ZurichStockExchange implements StockExchange {

    private Map<String, Double> prices = new HashMap<>();

    public ZurichStockExchange() {
        prices.put("MSFT", 120.0); // CHF
        prices.put("AAPL", 150.0);
    }

    @Override
    public double getPrice(String stockSymbol) {
        return prices.getOrDefault(stockSymbol, 0.0);
    }
}
