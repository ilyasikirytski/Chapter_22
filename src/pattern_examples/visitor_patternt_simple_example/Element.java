package pattern_examples.visitor_patternt_simple_example;

//элемент - автозапчасть
public interface Element {
    void accept(Visitor visitor);
}
