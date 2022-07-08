package Behavioural.Visitor;

public interface IElement {
    public int accept(IShoppingCartVisitor visitor);
}
