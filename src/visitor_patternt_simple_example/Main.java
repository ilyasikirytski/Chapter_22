package visitor_patternt_simple_example;

import visitor_pattern_example.EngineElement;

public class Main {
    public static void main(String[] args) {
//        new BadVisitor();
        Visitor visitor = new GoodVisitor();
        visitor.visit(new EngineElement());
        visitor.visit(new BodyElement());
    }
}
