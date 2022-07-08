package Structural.Proxy;

public class CycleDelivery implements PackageDelivery{
    @Override
    public String deliveryWay(PackageInfo packageInfo) {
        return "Delivering using cycle";
    }
}
