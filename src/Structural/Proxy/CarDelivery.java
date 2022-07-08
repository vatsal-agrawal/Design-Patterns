package Structural.Proxy;

public class CarDelivery implements PackageDelivery{
    @Override
    public String deliveryWay(PackageInfo packageInfo) {
        return "Delivering using car";
    }
}
