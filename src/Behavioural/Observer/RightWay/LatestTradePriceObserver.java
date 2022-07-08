package Behavioural.Observer.RightWay;

public class LatestTradePriceObserver implements MarketDataObserver{

    @Override
    public String processMarketData(MarketData marketData) {
        System.out.println(marketData.getLtp());
        return " " + marketData.getLtp();
    }
}
