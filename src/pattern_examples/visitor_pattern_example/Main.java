package pattern_examples.visitor_pattern_example;

public class Main {
    public static void main(String[] args) {
//        new GoodVisitor();
        Visitor visitor = new BadVisitor();
//        EngineElement engineElement = new EngineElement();
//        BodyElement bodyElement = new BodyElement();
        CarElement carElement = new CarElement();

        carElement.accept(visitor);
//        engineElement.accept(visitor);
//        bodyElement.accept(visitor);
    }
}
