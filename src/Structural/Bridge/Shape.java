package Structural.Bridge;


public abstract class Shape {

    public Color color;
    Shape(Color color){
        this.color = color;
    }
    public abstract void getShape();
}
