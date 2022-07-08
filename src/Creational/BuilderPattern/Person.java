package Creational.BuilderPattern;

public class Person {
    String firstName;
    String middleName;
    String lastName;
    int age;
    String fathersName;
    String mothersName;
    double height;
    double weight;

    public Person(String firstName, String middleName, String lastName, int age, String fathersName, String mothersName, double height, double weight) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.fathersName = fathersName;
        this.mothersName = this.mothersName;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", fathersName='" + fathersName + '\'' +
                ", mothersName='" + mothersName + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
