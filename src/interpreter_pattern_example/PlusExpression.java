package interpreter_pattern_example;

//non-terminal expression
public class PlusExpression implements Expression {
    Expression left;
    Expression right;

    public PlusExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Integer interpret() {
        return left.interpret() + right.interpret();
    }
}
