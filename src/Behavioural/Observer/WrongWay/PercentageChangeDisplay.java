package Behavioural.Observer.WrongWay;

public class PercentageChangeDisplay {
    double previousLTP;
    PercentageChangeDisplay(double prev){
        previousLTP = prev;
    }

    public void processMarketData(MarketData marketData){

        System.out.println(((marketData.getLtp() - previousLTP) / previousLTP) * 100 );
        this.previousLTP = marketData.getLtp();
    }
}
