package Creational.Factory;

public class LargeCombo extends Combos{
    @Override
    public void createCombo() {

        regularOrders.add(new Burger());
        regularOrders.add(new Burger());
        regularOrders.add(new ColdDrink());
    }
}
