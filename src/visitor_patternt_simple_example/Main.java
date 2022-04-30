package visitor_patternt_simple_example;

public class Main {
    public static void main(String[] args) {
//        new BadVisitor();
        Visitor visitor = new GoodVisitor();
        BodyElement bodyElement = new BodyElement();
        EngineElement engineElement = new EngineElement();

        bodyElement.accept(visitor);
        engineElement.accept(visitor);
    }
}
