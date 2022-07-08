package Creational.AbstractFactoryPattern;

public class FuelFactory {
    private FuelFactory(){}

    public static FuelVehicle getFuelVehicle(CarBodyType carBodyType){
        switch (carBodyType){
            case SUV -> {
                return new SUVFuel();
            }
            case SEDAN -> {
                return new SedanFuel();
            }
        }
        return null;
    }
}
