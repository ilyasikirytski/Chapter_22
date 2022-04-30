package template_method_pattern_example;

public class Main {
    public static void main(String[] args) {
        AbstractClassC classA = new ClassA();
        classA.templatePrint();
        System.out.println();
        AbstractClassC classB = new ClassB();
        classB.templatePrint();
    }
}
