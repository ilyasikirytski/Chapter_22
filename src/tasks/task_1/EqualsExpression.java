package tasks.task_1;

public class EqualsExpression implements Expression {
    String data;

    public EqualsExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return data.equals(context);
    }
}
