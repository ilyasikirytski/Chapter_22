package visitor_patternt_simple_example;

import visitor_pattern_example.EngineElement;

//concrete visitor
public class BadVisitor implements Visitor {
    @Override
    public void visit(EngineElement engineElement) {
        System.out.println("сломал двигатель");
    }

    @Override
    public void visit(BodyElement bodyElement) {
        System.out.println("поцарапал кузов");
    }
}
