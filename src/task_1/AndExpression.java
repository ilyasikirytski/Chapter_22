package task_1;

public class AndExpression implements Expression {
    Expression left;
    Expression right;

    public AndExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret(String context) {
        return left.interpret(context) && right.interpret(context);
    }
}
