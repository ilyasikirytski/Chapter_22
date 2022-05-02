package pattern_examples.template_method_pattern_example;

public class ClassA extends AbstractClassC {

    @Override
    public void differ() {
        System.out.print("2");
    }

    @Override
    void differ2() {
        System.out.println("5");
    }
}
