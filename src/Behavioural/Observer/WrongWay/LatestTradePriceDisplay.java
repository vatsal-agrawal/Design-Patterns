package Behavioural.Observer.WrongWay;

public class LatestTradePriceDisplay {

    public void processMarketData(MarketData marketData){
        System.out.println(marketData.getLtp());
    }
}
