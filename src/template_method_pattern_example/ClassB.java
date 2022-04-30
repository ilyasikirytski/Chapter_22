package template_method_pattern_example;

public class ClassB extends AbstractClassC {

    @Override
    public void differ() {
        System.out.print("5");
    }

    @Override
    void differ2() {
    }
}
