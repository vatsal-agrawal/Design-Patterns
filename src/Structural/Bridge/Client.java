package Structural.Bridge;

public class Client {
    public static void main(String[] args) {
        Shape shape = new Rectangle(new Black());
        shape.getShape();
    }
}
