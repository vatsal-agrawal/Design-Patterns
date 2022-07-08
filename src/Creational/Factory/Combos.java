package Creational.Factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Combos {

    List<RegularOrders> regularOrders = new ArrayList<>();
    Combos(){
        createCombo();
    }
    public abstract void createCombo();

    public void printOrder(){
        for(RegularOrders order : regularOrders){
            order.printOrder();
        }
    }
}
