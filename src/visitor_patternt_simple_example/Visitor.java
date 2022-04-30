package visitor_patternt_simple_example;

import visitor_pattern_example.EngineElement;

//visitor - посетитель
public interface Visitor {
    void visit(EngineElement engineElement);

    void visit(BodyElement bodyElement);
}
