package Structural.Decorator;

public class BlueShapeDecorator extends ShapeDecorator{

    BlueShapeDecorator(Shape shape) {
        super(shape);
    }

    public void draw(){
        shape.draw();
        printColor();
    }

    private void printColor(){
        System.out.println("Blue");
    }
}
