package Creational.AbstractFactoryPattern;

public class ElectricFactory {
    private ElectricFactory() { // private constructor is kept to avoid instantiation
    }

    public static ElectricVehicle getElectricVehicle(CarBodyType carBodyType){
        switch (carBodyType){
            case SUV -> {
                return new SuvElectric();
            }
            case SEDAN -> {
                return new SedanElectric();
            }
        }
        return null;
    }
}
