package Creational.BuilderPattern;

public class PersonBuilder{
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String fathersName;
    private String mothersName;
    private double height;
    private double weight;

    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder setMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setFathersName(String fathersName) {
        this.fathersName = fathersName;
        return this;
    }

    public PersonBuilder setMothersName(String mothersName) {
        this.mothersName = mothersName;
        return this;
    }

    public PersonBuilder setHeight(double height) {
        this.height = height;
        return this;
    }

    public PersonBuilder setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public Person build(){
        return new Person(firstName,lastName,middleName,age,fathersName,mothersName,height,weight);
    }
}
