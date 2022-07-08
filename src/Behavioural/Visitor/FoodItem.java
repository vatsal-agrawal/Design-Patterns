package Behavioural.Visitor;

public class FoodItem implements IElement{

    private int pricePerKg;
    private int weight;
    private String name;

    public FoodItem(int priceKg, int wt, String nm){
        this.pricePerKg=priceKg;
        this.weight=wt;
        this.name = nm;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }

    public int getWeight() {
        return weight;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public int accept(IShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}