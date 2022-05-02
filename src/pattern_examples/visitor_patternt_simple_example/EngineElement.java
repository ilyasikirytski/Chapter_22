package pattern_examples.visitor_patternt_simple_example;

//двигатель
public class EngineElement implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
