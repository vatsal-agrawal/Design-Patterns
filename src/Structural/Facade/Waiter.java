package Structural.Facade;

public class Waiter {
    private Waiter(){}
    public static String callFood(FoodType foodType){
        switch (foodType){
            case PASTA -> {
                Food food = new Pasta();
                food.prepareFood("White Sauce");
                return food.deliverFood();
            }
            case PIZZA -> {
                Food food = new Pizza();
                food.prepareFood("Extravaganza");
                return food.deliverFood();
            }
        }
        return null;
    }
}
