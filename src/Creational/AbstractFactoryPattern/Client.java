package Creational.AbstractFactoryPattern;

public class Client {
    public static void main(String[] args) {
        Vehicle v = VehicleFactory.getVechicle(CarBodyType.SEDAN,TypeOfInput.ELECTRIC);
        v.status();
        v.greet();
    }
}
