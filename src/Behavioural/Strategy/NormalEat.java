package Behavioural.Strategy;

public class NormalEat implements EatBehaviour{
    @Override
    public void eat() {
        System.out.println("Normal eat");
    }
}
