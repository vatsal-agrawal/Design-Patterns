package Structural.Proxy;

public class ProxyCarDelivery extends CarDelivery{
    public String deliveryWay(PackageInfo packageInfo) {
        if(packageInfo.getWeight() > 100)
            return "Cannot deliver using car";
        return super.deliveryWay(packageInfo);
    }
}
