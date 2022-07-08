package Structural.Proxy;

public class TruckDelivery implements PackageDelivery{
    @Override
    public String deliveryWay(PackageInfo packageInfo) {
        return "Delivering using truck";
    }
}
