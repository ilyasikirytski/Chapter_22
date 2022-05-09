package pattern_examples.visitor_pattern_example;

//visitor - посетитель
public interface Visitor {
    //сделать один метод (а в качестве параметра передать Element)
//    void visit(EngineElement engineElement);
//
//    void visit(BodyElement bodyElement);
//
//    void visit(CarElement carElement);
//
//    void visit(WheelElement wheelElement);
    void visit(Element element);
}
