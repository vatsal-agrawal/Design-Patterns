package Behavioural.Observer.RightWay;

import Behavioural.Observer.WrongWay.LatestTradePriceDisplay;

import java.awt.image.Kernel;

public class Main {
    public static void main(String[] args) {
        LatestTradePriceObserver latestTradePriceObserver = new LatestTradePriceObserver();
        PercentageChangeObserver percentageChangeObserver = new PercentageChangeObserver(10);

        StockMarketDataHandler stockMarketDataHandler = new StockMarketDataHandler();
        stockMarketDataHandler.subscribe(latestTradePriceObserver);
        stockMarketDataHandler.subscribe(percentageChangeObserver);

        stockMarketDataHandler.handleMarketData(new MarketData("abc",20,30));
        stockMarketDataHandler.handleMarketData(new MarketData("def",21,100));

    }
}
