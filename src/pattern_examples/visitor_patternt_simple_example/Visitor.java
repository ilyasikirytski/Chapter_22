package pattern_examples.visitor_patternt_simple_example;

//visitor - посетитель
public interface Visitor {
    void visit(EngineElement engineElement);

    void visit(BodyElement bodyElement);
}
