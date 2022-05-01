package task_1;

public class ContainsExpression implements Expression {
    private String data;

    public ContainsExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
