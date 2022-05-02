package tasks.task_1;

public class ComparisonExpression implements Expression {
    int left;
    int right;

    public ComparisonExpression(int left, int right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret(String context) {
        return switch (context) {
            case ">" -> left > right;
            case "<" -> left < right;
            case "==" -> left == right;
            default -> left != right;
        };
    }
}
