package visitor_patternt_simple_example;

public class Main {
    public static void main(String[] args) {
//        new BadVisitor();
        Visitor visitor = new GoodVisitor();
        visitor.visit(new EngineElement());
        visitor.visit(new BodyElement());
    }
}
