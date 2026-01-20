public class Main {

    public static void main(String[] args) {

        Portfolio portfolio = new Portfolio();
        portfolio.addStock(new Stock("MSFT", 2));
        portfolio.addStock(new Stock("AAPL", 3));

        StockExchange ny = new NYStockExchange();
        StockExchange zurich = new ZurichStockExchange();

        System.out.println("NYSE:");
        portfolio.printPortfolioValue(ny);

        System.out.println("Zürich:");
        portfolio.printPortfolioValue(zurich);
    }
}
