package Creational.Factory;

public class MediumCombo extends Combos{
    @Override
    public void createCombo() {
        regularOrders.add(new ColdDrink());
        regularOrders.add(new Burger());
    }
}
