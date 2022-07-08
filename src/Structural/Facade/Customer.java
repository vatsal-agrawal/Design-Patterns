package Structural.Facade;

public class Customer {
    public static void main(String[] args) {
        String food = Waiter.callFood(FoodType.PASTA);
        System.out.println(food);
    }
}
