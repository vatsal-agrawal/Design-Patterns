package Creational.Factory;

public class HotelMealApplication {
    public static void main(String[] args) {
        Combos largeCombo = ComboCreator.getComboType(ComboType.LARGE);
        largeCombo.printOrder();
    }
}
