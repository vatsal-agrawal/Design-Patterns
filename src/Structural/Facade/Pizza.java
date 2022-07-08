package Structural.Facade;

public class Pizza implements Food{
    String customizedFood;
    @Override
    public void prepareFood(String ingredients) {
        customizedFood = "Pizza "+ ingredients;
    }

    @Override
    public String deliverFood() {
        return customizedFood;
    }
}
