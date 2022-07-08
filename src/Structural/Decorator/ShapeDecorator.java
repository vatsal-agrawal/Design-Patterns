package Structural.Decorator;

public class ShapeDecorator implements Shape{
    Shape shape;
    ShapeDecorator(Shape shape){
        this.shape = shape;
    }
    @Override
    public void draw() {
        shape.draw();
    }
}
