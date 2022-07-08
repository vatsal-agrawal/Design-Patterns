package Structural.Proxy;

public class DeliveryFactory {
    private DeliveryFactory(){}

    public static String deliver(PackageInfo packageInfo){
        if (packageInfo.getName().equals("SMALL")){
            return new ProxyCycleDelivery().deliveryWay(packageInfo);
        }
        else if (packageInfo.getName().equals("MEDIUM")){
            return new ProxyCarDelivery().deliveryWay(packageInfo);
        }
        else if (packageInfo.getName().equals("LARGE")){
            return new ProxyTruckDelivery().deliveryWay(packageInfo);
        }
        return new ProxyTruckDelivery().deliveryWay(packageInfo);
    }
}
