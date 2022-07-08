package Behavioural.Strategy;

public class Labrador extends Dog{
    Labrador(){
        eatBehaviour = new ProteinEat();
        barkBehaviour = new PlayfulBark();
    }

    public void display(){
        System.out.println("I am a labrador");
    }
}
