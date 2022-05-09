package pattern_examples.visitor_pattern_example;

//concrete visitor
public class BadVisitor implements Visitor {
//    @Override
//    public void visit(EngineElement engineElement) {
//        System.out.println("сломал двигатель");
//    }
//
//    @Override
//    public void visit(BodyElement bodyElement) {
//        System.out.println("поцарапал кузов");
//    }
//
//    @Override
//    public void visit(CarElement bodyElement) {
//        System.out.println("проверил внешний вид авто");
//    }
//
//    @Override
//    public void visit(WheelElement bodyElement) {
//        System.out.println("спустил " + bodyElement.getName() + " колесо");
//    }

    @Override
    public void visit(Element element) {
        if (element instanceof EngineElement) {
            System.out.println("сломал двигатель");
        } else if (element instanceof BodyElement) {
            System.out.println("поцарапал кузов");
        } else if (element instanceof CarElement) {
            System.out.println("покурил в салоне");
        } else {
            System.out.println("спустил " + ((WheelElement) element).getName() + " колесо");
        }
    }
}
