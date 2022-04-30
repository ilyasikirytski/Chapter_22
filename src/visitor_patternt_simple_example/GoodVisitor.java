package visitor_patternt_simple_example;

import visitor_pattern_example.EngineElement;

//concrete visitor
public class GoodVisitor implements Visitor {
    @Override
    public void visit(EngineElement engineElement) {
        System.out.println("починил двигатель");
    }

    @Override
    public void visit(BodyElement bodyElement) {
        System.out.println("отполировал кузов");
    }
}
