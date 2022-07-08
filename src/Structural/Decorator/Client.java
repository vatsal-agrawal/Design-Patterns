package Structural.Decorator;

public class Client {
    public static void main(String[] args) {
        ShapeDecorator shapeDecorator = new BlueShapeDecorator(new Rectangle());
        shapeDecorator.draw();
    }
}
