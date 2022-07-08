package Behavioural.Observer.RightWay;

public class PercentageChangeObserver implements MarketDataObserver{
    double prevLTP;
    PercentageChangeObserver(double prev){
        this.prevLTP = prev;
    }

    @Override
    public String processMarketData(MarketData marketData) {
        System.out.println(((marketData.getLtp() - prevLTP) / prevLTP) * 100);
        return " " + ((marketData.getLtp() - prevLTP) / prevLTP) * 100;
    }
}
