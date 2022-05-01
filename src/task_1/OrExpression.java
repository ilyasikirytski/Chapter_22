package task_1;

public class OrExpression implements Expression {
    Expression left;
    Expression right;

    public OrExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret(String context) {
        return left.interpret(context) || right.interpret(context);
    }
}
