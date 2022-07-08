package Structural.FlyWeight;

public class Client {

    static String[] colors = {"Red","Green","Blue"};

    public static void main(String[] args) {

        for(int i=0;i<15;i++){
            Character character = CharacterFactory.getCharacter(getRandomColor());
            character.render();
        }
    }
    public static String getRandomColor(){
        return colors[(int) (Math.random() * colors.length)];
    }
}
