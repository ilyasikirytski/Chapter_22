package pattern_examples.interpreter_pattern_example;

//terminal expression
public class NumberExpression implements Expression {
    int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public Integer interpret() {
        return number;
    }
}
