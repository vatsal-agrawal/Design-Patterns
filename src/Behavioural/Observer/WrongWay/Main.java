package Behavioural.Observer.WrongWay;

public class Main {
    public static void main(String[] args) {
        LatestTradePriceDisplay latestTradePriceDisplay = new LatestTradePriceDisplay();
        PercentageChangeDisplay percentageChangeDisplay = new PercentageChangeDisplay(20.1);

        StockMarketDataHandler stockMarketDataHandler = new StockMarketDataHandler(latestTradePriceDisplay, percentageChangeDisplay);

        stockMarketDataHandler.handleMarketData(new MarketData("sbi",30,100));
        stockMarketDataHandler.handleMarketData(new MarketData("sbi",32,100));
    }
}
