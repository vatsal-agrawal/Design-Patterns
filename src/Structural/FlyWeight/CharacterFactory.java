package Structural.FlyWeight;

import Structural.Bridge.Color;

import java.util.HashMap;

public class CharacterFactory {
    private CharacterFactory(){}
    static HashMap<String,Character> hm = new HashMap<>();
    public static Character getCharacter(String color){
        if(!hm.containsKey(color)){
            Character character = new Character1(color);
            hm.put(color,character);
        }
        return hm.get(color);
    }
}
