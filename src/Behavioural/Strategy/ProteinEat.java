package Behavioural.Strategy;

public class ProteinEat implements EatBehaviour{
    @Override
    public void eat() {
        System.out.println("Protein eat");
    }
}
