package pattern_examples.visitor_pattern_example;

//visitor - посетитель
public interface Visitor {
    void visit(EngineElement engineElement);

    void visit(BodyElement bodyElement);

    void visit(CarElement bodyElement);

    void visit(WheelElement bodyElement);
}
