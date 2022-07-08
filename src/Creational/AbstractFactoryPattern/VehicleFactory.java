package Creational.AbstractFactoryPattern;

import java.awt.color.ICC_ColorSpace;

public class VehicleFactory{
    private VehicleFactory(){}

    public static Vehicle getVechicle(CarBodyType carBodyType,TypeOfInput typeOfInput){
        switch (typeOfInput){
            case ELECTRIC -> {
                return ElectricFactory.getElectricVehicle(carBodyType);
            }
            case FUEL -> {
                return FuelFactory.getFuelVehicle(carBodyType);
            }
        }
        return null;
    }
}
