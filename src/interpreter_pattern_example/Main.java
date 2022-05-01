package interpreter_pattern_example;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        Expression expression = context.evaluate("1-2+3+4");
        System.out.println(expression.interpret());
    }
}
