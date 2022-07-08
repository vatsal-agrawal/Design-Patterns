package Behavioural.Strategy;

public abstract class Dog {
    EatBehaviour eatBehaviour;
    BarkBehaviour barkBehaviour;
    public Dog(){}

    public void setEatBehaviour(EatBehaviour eatBehaviour) {
        this.eatBehaviour = eatBehaviour;
    }

    public void setBarkBehaviour(BarkBehaviour barkBehaviour) {
        this.barkBehaviour = barkBehaviour;
    }

    public void doEat(){
        eatBehaviour.eat();
    }

    public void doBark(){
        barkBehaviour.bark();
    }
}
