package Structural.Bridge;

public class Rectangle extends Shape{

    Rectangle(Color color) {
        super(color);
    }

    @Override
    public void getShape() {
        System.out.println("Rectangle");
        color.getColor();
    }
}
