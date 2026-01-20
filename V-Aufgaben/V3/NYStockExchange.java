import java.util.HashMap;
import java.util.Map;

public class NYStockExchange implements StockExchange {

    private Map<String, Double> prices = new HashMap<>();

    public NYStockExchange() {
        prices.put("MSFT", 100.0); // USD
        prices.put("AAPL", 130.0);
    }

    @Override
    public double getPrice(String stockSymbol) {
        return prices.getOrDefault(stockSymbol, 0.0);
    }
}
