package Structural.Composite;

public class Client {
    public static void main(String[] args) {
        Topic topic = new Topic("t1");
        topic.addTopic(new Topic("1t1"));
        topic.addTopic(new Topic("1t2"));
        topic.addLecture(new Lecture("L1"));
        topic.printall();
    }
}
