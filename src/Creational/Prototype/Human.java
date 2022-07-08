package Creational.Prototype;

public class Human implements Prototype{
    String firstName;
    String lastName;
    int age;

    public Human() {
        System.out.println(firstName + " " + lastName + " " + age);

    }

    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        display();
    }

    private void display(){
        System.out.println(firstName + " " + lastName + " " + age);
    }


    @Override
    public Prototype getClone() {
        return new Human(firstName,lastName,age);
    }
}
