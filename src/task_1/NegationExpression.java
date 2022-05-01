package task_1;

public class NegationExpression implements Expression {
    String data;

    public NegationExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return !data.equals(context);
    }
}
