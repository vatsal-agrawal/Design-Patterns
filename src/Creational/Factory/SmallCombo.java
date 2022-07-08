package Creational.Factory;

public class SmallCombo extends Combos{
    @Override
    public void createCombo() {
        regularOrders.add(new Burger());
    }
}
