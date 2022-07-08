package Structural.Facade;

public class Pasta implements Food{

    String customizedFood;
    @Override
    public void prepareFood(String ingredients) {
        customizedFood = "Pasta "+ ingredients;
    }

    @Override
    public String deliverFood() {
        return customizedFood;
    }
}
