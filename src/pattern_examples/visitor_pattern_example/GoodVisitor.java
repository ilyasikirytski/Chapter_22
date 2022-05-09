package pattern_examples.visitor_pattern_example;

//concrete visitor
public class GoodVisitor implements Visitor {
//    @Override
//    public void visit(EngineElement engineElement) {
//        System.out.println("починил двигатель");
//    }
//
//    @Override
//    public void visit(BodyElement bodyElement) {
//        System.out.println("отполировал кузов");
//    }
//
//    @Override
//    public void visit(CarElement bodyElement) {
//        System.out.println("покурил внутри машины");
//    }
//
//    @Override
//    public void visit(WheelElement bodyElement) {
//        System.out.println("подкачал " + bodyElement.getName() + " колесо");
//    }

    @Override
    public void visit(Element element) {
        if (element instanceof EngineElement) {
            System.out.println("починил двигатель");
        } else if (element instanceof BodyElement) {
            System.out.println("отполировал кузов");
        } else if (element instanceof CarElement) {
            System.out.println("проветрил салон");
        } else {
            System.out.println("подкачал " + ((WheelElement) element).getName() + " колесо");
        }
    }
}
