package Behavioural.Observer.RightWay;

import java.util.ArrayList;
import java.util.List;

public class StockMarketDataHandler {
    private List<MarketDataObserver> marketDataObserverList = new ArrayList<>();

    public void subscribe(MarketDataObserver marketDataObserver){
        marketDataObserverList.add(marketDataObserver);
    }

    public void handleMarketData(MarketData marketData){
        marketDataObserverList.stream().forEach(marketDataObserver -> marketDataObserver.processMarketData(marketData));
    }

    public void remove(int idx){
        marketDataObserverList.remove(idx);
    }
}
