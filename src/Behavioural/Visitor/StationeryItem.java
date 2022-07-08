package Behavioural.Visitor;

public class StationeryItem implements IElement{


    private int noOfItem;
    private int pricePerItem;
    private String name;

    public StationeryItem(int noOfItem, int pricePerItem, String nm){
        this.noOfItem=noOfItem;
        this.pricePerItem = pricePerItem;
        this.name = nm;
    }

    public int getPricePerItem() {
        return pricePerItem;
    }

    public int getNoOfItem() {
        return noOfItem;
    }


    public String getName(){
        return this.name;
    }

    @Override
    public int accept(IShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

}