package Behavioural.Visitor;

public class ShoppingCartVisitorImpl implements IShoppingCartVisitor {

    @Override
    public int visit(FoodItem foodItem) {
        int cost=0;

        if(foodItem.getPricePerKg()*foodItem.getWeight() > 500){
            cost = (int) ((foodItem.getPricePerKg()- 50)*foodItem.getWeight());
        }else{
            cost = foodItem.getPricePerKg()*foodItem.getWeight();
        }
        System.out.println(foodItem.getName()+":"+foodItem.getWeight() + " kg in weight"+" costs :: "+cost);
        return cost;
    }

    @Override
    public int visit(StationeryItem sItem) {
        int cost = sItem.getPricePerItem()*sItem.getNoOfItem();
        System.out.println(sItem.getName() + ":: total cost = "+cost);
        return cost;
    }

}