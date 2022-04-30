package visitor_patternt_simple_example;

//кузов
public class BodyElement implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
