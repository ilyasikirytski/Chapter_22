package visitor_pattern_example;

//элемент - автозапчасть
public interface Element {
    void accept(Visitor visitor);
}
