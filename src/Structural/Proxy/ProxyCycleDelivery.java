package Structural.Proxy;

public class ProxyCycleDelivery extends CycleDelivery{
    public String deliveryWay(PackageInfo packageInfo) {
        if(packageInfo.getWeight() > 10)
            return "Cannot deliver using cycle";
        return super.deliveryWay(packageInfo);
    }
}
