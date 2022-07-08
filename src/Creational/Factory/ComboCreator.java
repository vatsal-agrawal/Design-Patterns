package Creational.Factory;

public class ComboCreator {
    public static Combos getComboType(ComboType comboType){
        switch (comboType){
            case LARGE -> {
                return new LargeCombo();
            }
            case MEDIUM -> {
                return new MediumCombo();
            }
            case SMALL -> {
                return new SmallCombo();
            }
        }
        return null;
    }
}
