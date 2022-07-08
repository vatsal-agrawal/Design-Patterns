package Behavioural.Visitor;

public interface IShoppingCartVisitor {
    int visit(FoodItem foodItem);
    int visit(StationeryItem stationeryItem);
}
