package Structural.Proxy;

public class Client {
    public static void main(String[] args) {
        PackageInfo packageInfo = new PackageInfo("SMALL",9);
        String output = DeliveryFactory.deliver(packageInfo);
        System.out.println(output);

        PackageInfo packageInfo1 = new PackageInfo("SMALL",11);
        String output1 = DeliveryFactory.deliver(packageInfo1);
        System.out.println(output1);
    }
}
