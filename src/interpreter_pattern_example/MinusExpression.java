package interpreter_pattern_example;

//non-terminal expression
public class MinusExpression implements Expression {
    Expression left;
    Expression right;

    public MinusExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Integer interpret() {
        return left.interpret() - right.interpret();
    }
}
