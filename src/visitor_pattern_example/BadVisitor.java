package visitor_pattern_example;

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

    @Override
    public void visit(CarElement bodyElement) {
        System.out.println("проверил внешний вид авто");
    }

    @Override
    public void visit(WheelElement bodyElement) {
        System.out.println("спустил " + bodyElement.getName() + " колесо");
    }
}
