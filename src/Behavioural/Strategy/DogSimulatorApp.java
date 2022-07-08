package Behavioural.Strategy;

public class DogSimulatorApp {
    public static void main(String[] args) {
        Dog dog = new Labrador();
        dog.doEat();
        dog.doBark();

        dog.setBarkBehaviour(new NormalBark());
        dog.doBark();
    }
}
