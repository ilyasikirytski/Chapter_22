package pattern_examples.template_method_pattern_example;

abstract class AbstractClassC {
    void templatePrint() {
        System.out.print("1");
        differ();
        System.out.print("3");
        differ2();
    }

    abstract void differ();

    abstract void differ2();
}
