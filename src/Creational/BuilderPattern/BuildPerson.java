package Creational.BuilderPattern;

public class BuildPerson {
    public static void main(String[] args) {
        Person person = new PersonBuilder().setAge(10).setFathersName("a").build();
        System.out.println(person);
    }
}
