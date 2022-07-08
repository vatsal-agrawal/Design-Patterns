package Behavioural.Strategy;

public class NormalBark implements BarkBehaviour{
    @Override
    public void bark() {
        System.out.println("Normal Bark");
    }
}
