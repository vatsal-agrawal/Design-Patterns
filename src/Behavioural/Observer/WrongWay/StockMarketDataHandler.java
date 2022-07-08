package Behavioural.Observer.WrongWay;

public class StockMarketDataHandler {
    LatestTradePriceDisplay latestTradePriceDisplay;
    PercentageChangeDisplay percentageChangeDisplay;
    StockMarketDataHandler(LatestTradePriceDisplay latestTradePriceDisplay, PercentageChangeDisplay percentageChangeDisplay){
        this.latestTradePriceDisplay = latestTradePriceDisplay;
        this.percentageChangeDisplay = percentageChangeDisplay;
    }

    public void handleMarketData(MarketData marketData){
        this.latestTradePriceDisplay.processMarketData(marketData);
        this.percentageChangeDisplay.processMarketData(marketData);
    }
}
