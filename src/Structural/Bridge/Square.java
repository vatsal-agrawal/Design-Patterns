package Structural.Bridge;

public class Square extends Shape{

    Square(Color color){
        super(color);
    }

    @Override
    public void getShape() {
        System.out.println("Square");
        color.getColor();
    }
}
