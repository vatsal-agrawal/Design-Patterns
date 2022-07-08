package Creational.Prototype;

public class HumanPrototypeMain {

    public static void main(String[] args) {
        Prototype humanPrototype = new Human("a","b",10);
        Human humanPrototype1 = (Human) humanPrototype.getClone();
    }
}
