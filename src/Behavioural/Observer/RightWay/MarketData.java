package Behavioural.Observer.RightWay;

public class MarketData {
    String symbol;
    double ltp;
    int quantity;

    public MarketData(String symbol, double ltp, int quantity) {
        this.symbol = symbol;
        this.ltp = ltp;
        this.quantity = quantity;
    }

    public double getLtp() {
        return ltp;
    }
}
