package Behavioural.Visitor;

public class ShoppingCartClient {

    public static void main(String[] args) {
        IElement[] items = new IElement[]{new StationeryItem(5,50, "NoteBook"),new StationeryItem(2,20, "Pen"),
                new FoodItem(30, 5, "Potato"), new FoodItem(50, 2, "Orange")};

        int total = calculatePrice(items);
        System.out.println("Total Cost of all the items in the cart = "+total);
    }
    private static int calculatePrice(IElement[] items) {
        IShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum=0;
        for(IElement item : items){
            sum = sum + item.accept(visitor);
        }
        return sum;
    }
}