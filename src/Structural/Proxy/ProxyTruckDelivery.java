package Structural.Proxy;

public class ProxyTruckDelivery extends TruckDelivery{
    public String deliveryWay(PackageInfo packageInfo) {
        if(packageInfo.getWeight() > 1000)
            return "Cannot deliver using truck";
        return super.deliveryWay(packageInfo);
    }
}
