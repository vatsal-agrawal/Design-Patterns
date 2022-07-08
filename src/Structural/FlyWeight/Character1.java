package Structural.FlyWeight;

public class Character1 implements Character{
    String color;
    int x;
    int y;
    Character1(String color){
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


    @Override
    public void render() {
        System.out.println(color + " " + x +" " + y);
    }
}
